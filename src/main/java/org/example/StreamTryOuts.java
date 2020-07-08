package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTryOuts {
    public static void main(String[] args) throws IOException {
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::println);
        System.out.println();

        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );

        Stream.of("x3000", "x2", "f300", "x60", "x30")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

        String[] names = {"ali", "baba", "suraj", "laxmi", "soni", "mahesh"};
        Arrays.stream(names)
                .filter(u -> u.startsWith("s"))
                .sorted()
                .forEach(System.out::println);

        int[] numbers = {2, 4, 5, 7, 2};
        Arrays.stream(numbers)
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        System.out.println();


        List<String> people = Arrays.asList("al", "anu", "suraj", "suk maya", "amrit", "sanju");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        Stream<String> firstName = Files.lines(Paths.get("src/main/resources/firstName.txt"));
        firstName
                .sorted()
                .filter(x -> x.length() > 8)
                .forEach(System.out::println);
        firstName.close();

        System.out.println();


        List<String> firstName1 = Files.lines(Paths.get("src/main/resources/firstName.txt"))
                .filter(x -> x.contains("bahadur"))
                .collect(Collectors.toList());

        firstName1.forEach(System.out::println);

        System.out.println("Stream row from csv file and count");

        Stream<String> rows1 = Files.lines(Paths.get("src/main/resources/data.txt"));
        long count = rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(count);
        rows1.close();

        System.out.println("stream row from csv and parsing");
        Stream<String> rows2 = Files.lines(Paths.get("src/main/resources/data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 50)
                .forEach(y -> System.out.println(y[0] + " " + y[1] + " " + y[2]));
        rows2.close();

        System.out.println("stream csv and hashmap");
        Stream<String> rows3 = Files.lines(Paths.get("src/main/resources/data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(y -> y.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 50)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));

        }


//        System.out.println("reduction");
//
//        double total = Stream.of(3.3, 6.4, 34.53, 600.4, 1)
//                .reduce(0.0, (double a, double b)->a+b);
//        System.out.println("totoal is: " + total);

        System.out.println("summery statics:");

        IntSummaryStatistics summery=IntStream.of(34,43,99,12,30,23,59)
                .summaryStatistics();
        System.out.println(summery);
    }
}
