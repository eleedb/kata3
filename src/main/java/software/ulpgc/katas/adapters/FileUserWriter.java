package software.ulpgc.katas.adapters;

import software.ulpgc.katas.domain.model.User;
import software.ulpgc.katas.ports.UserWriter;

import java.io.*;

public class FileUserWriter implements UserWriter {
    private final File file;

    public FileUserWriter(File file) {
        this.file = file;
    }

    @Override
    public void write(User user) {
        try(OutputStream outputStream = new FileOutputStream(new File(file, user.name() + "jpg"))){
            write(user, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void write(User user, OutputStream outputStream) throws IOException {
        outputStream.write(user.photo().data());
    }
}
