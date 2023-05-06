package Foundation.StreamAPI;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 7);
        Stream<Integer> streamData = list.stream();
        // long count = streamData.count();
        // System.out.println(count);
        // NOTE: once you have consumed you can't work on it again create new stream to
        // do
        // that

        // streamData.forEach(n -> System.out.println(n));

        // streamData.forEach(n -> {
        // int newData = n * n;
        // System.out.println(newData);
        // });
        System.out.println();
        Stream<Integer> newStreamData = list.stream();
        newStreamData.forEach(n -> {
            int newData = n * n;
            System.out.println(newData);
        });

        // Stream<Integer> sortedStream = streamData.sorted();
        // Stream<Integer> mapStream = sortedStream.map(n -> n * 3);
        // mapStream.forEach(n -> System.out.println(n));
        // Stream<Integer> filterData = streamData.filter(n -> n % 2 == 0);
        // filterData.forEach(n -> System.out.println(n));
        // method chaining can be done separatly as shown above
        Stream<Integer> finalStream = streamData.filter(n -> n % 2 == 0).sorted().map(n -> n * 2);
        System.out.println("Final Stream");
        finalStream.forEach(n -> System.out.println(n));
    }
}
