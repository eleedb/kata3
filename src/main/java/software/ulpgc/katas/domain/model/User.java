package software.ulpgc.katas.domain.model;

import java.time.Instant;

public record User(String name, Gender gender, Instant birthday, Photo photo) {
    public record Photo(byte[] data) {}
}
