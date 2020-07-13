package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTryOut {
    private static Stream<String> lines;

    public static void main(String[] args) {
        try {
            lines = Files.lines(Paths.get("src/main/resources/data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> collect = lines
                .map(x -> x.split(","))
                .filter(y->y.length==3)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        System.out.println(collect.keySet());


    }
}
