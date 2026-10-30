package software.ulpgc.katas.ports;

import software.ulpgc.katas.domain.model.User;

public interface UserWriter {
    void write(User user);
}
