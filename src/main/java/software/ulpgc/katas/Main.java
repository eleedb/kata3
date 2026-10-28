package software.ulpgc.katas;

import software.ulpgc.katas.adapters.FileUserWriter;
import software.ulpgc.katas.adapters.JsonRandomUserReader;
import software.ulpgc.katas.domain.model.User;
import software.ulpgc.katas.ports.UserWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<User> users = new JsonRandomUserReader().read();
        UserWriter writer = new FileUserWriter(new File("users"));
        for (User user : users) {
            writer.write(user);
        }
    }
}
