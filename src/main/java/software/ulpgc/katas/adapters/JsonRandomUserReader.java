package software.ulpgc.katas.adapters;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import software.ulpgc.katas.domain.model.Gender;
import software.ulpgc.katas.domain.model.User;
import software.ulpgc.katas.ports.UserReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class JsonRandomUserReader implements UserReader {
    @Override
    public List<User> read() {
       try{
           return readFrom(new URI("https://randomuser.me/api?results=20&nat=us,gb"));
       } catch (URISyntaxException | IOException | InterruptedException e) {
           throw new RuntimeException(e);
       }
    }

    private List<User> readFrom(URI uri) throws IOException, InterruptedException {
        return readFrom(HttpRequest.newBuilder().GET().uri(uri).build());
    }

    private List<User> readFrom(HttpRequest request) throws IOException, InterruptedException {
        try (HttpClient httpClient = HttpClient.newHttpClient()) {
            return readFrom(httpClient.send(request, HttpResponse.BodyHandlers.ofString()));
        }
    }

    private List<User> readFrom(HttpResponse<String> response) throws IOException{
        return readFrom(response.body());
    }

    private List<User> readFrom(String json) throws IOException {
        return readFrom(new Gson().fromJson(json, JsonObject.class).get("results").getAsJsonArray());
    }

    private List<User> readFrom(JsonArray items) throws IOException {
        List<User> users = new ArrayList<>();
        for (JsonElement element : items) {
            users.add(readFrom(element));
        }
        return users;
    }

    private User readFrom(JsonElement element) throws IOException {
        return readFrom(new Gson().fromJson(element, UserDto.class));
    }

    private User readFrom(UserDto dto) throws IOException {
        return new User(
                dto.name.first + " " + dto.name.last,
                Gender.valueOf(dto.gender),
                Instant.parse(dto.dob.date),
                photoIn(dto.picture.large)
        );
    }

    private User.Photo photoIn(String large) throws IOException {
        return photoIn(new URL(large));
    }

    private User.Photo photoIn(URL url) throws IOException {
        try (InputStream is = url.openStream()) {
            return photoIn(is);
        }
    }

    private User.Photo photoIn(InputStream is) throws IOException {
        return new User.Photo(is.readAllBytes());
    }
}
