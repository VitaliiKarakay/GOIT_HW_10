package task2;

/*
Метод принимает на вход список из строк (можно список из Задания 1).
Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseAndSort {
    public static void main(String[] args) {
        List<String> nameList = Stream.of("Valera", "Ivan", "Igor", "Slava", "Vlad", "Vladimir", "Artur", "Zzzar")
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(nameList);

    }
}
