package JavaQuestionsInterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferenceBetweenMapAndFlatMap {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(2,3,5,9,32,5,4));
        System.out.println(list.stream().map(i -> i * 2).collect(Collectors.toList()));

        System.out.println(list.stream().flatMap(i -> {
            if (i % 2 == 0) {
                return Stream.of(i * 2);
            } else {
                return Stream.of(i * 3);
            }
        }).collect(Collectors.toList()));
    }
}
