package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatAndSort {
    public static void main(String[] args) {
        List<String> inputList = Stream.of("1, 2, 0", "4, 5")
                        .flatMap(s -> Arrays.stream(s.split(" ")))
                                .map(s -> s.replace(",", ""))
                                        .sorted()
                                                .collect(Collectors.toList());

        System.out.println(inputList);
    }
}
