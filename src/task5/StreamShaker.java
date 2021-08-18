package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) который "перемешивает" элементы
из стримов first и second, останавливается тогда, когда у одного из стримов закончатся элементы.
*/
public class StreamShaker {

    public static void main(String[] args) {

        List<String> firstList = List.of("A", "B", "C", "D");
        List<String> secondList = List.of("1", "2", "3", "4", "5");
        Stream<String> first = firstList.stream();
        Stream<String> second = secondList.stream();

        List<String> collect = zip(first, second).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        int a = 0;
        int b = 0;


        List<T> list = new ArrayList<>();
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());

        boolean isFirst = false;
        for (int i = 0; i < list1.size() + list2.size(); i++) {
            if (a == list1.size() || b == list2.size()) {
                break;
            } else if (isFirst) {
                list.add(list1.get(a));
                isFirst = false;
                a++;
            } else {
                list.add(list2.get(b));
                isFirst = true;
                b++;
            }
        }
        return list.stream();
    }
}
