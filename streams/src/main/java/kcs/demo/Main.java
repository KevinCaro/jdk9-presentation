package kcs.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Stream<String> stringStream = Files.list(Paths.get("..")).map(p -> p.toString());
        String[] objects = (String[]) stringStream.toArray();
    }
}
