package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...",
с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).
 */

public class OddNames {

    public static void main(String[] args) {
        List<String> nameList = List.of("Valera", "Ivan", "Igor", "Slava", "Vlad", "Vladimir");

        nameList = filterOdd(nameList);
        print(nameList);

    }

    private static List<String> filterOdd(List<String> nameList) {
        List<String> namesOddList = IntStream.range(0, nameList.size())
                .filter(s -> (s%2 == 1))
                .mapToObj(nameList::get)
                .collect(Collectors.toList());
        return namesOddList;
    }

    private static void print(List<String> list) {
        int i = 1;
        String string = "";
        for (int j = 0; j < list.size(); j++) {
            string = string + i + ". " + list.get(j) + ", ";
            i+=2;
        }
        string = string.strip();
        if (string.endsWith(",")) {
            string = string.substring(0, string.length()-1);
        }
        System.out.println(string.trim());
    }

}
