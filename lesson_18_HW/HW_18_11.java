package students.Vkakurin.lesson_18_HW;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class HW_18_11 {
    //Реализуйте алгоритм поиска всех уникальных элементов в двух массивах и их объединение
    // в новый массив с использованием Java Stream API.
    public static void main(String[] args) {
        List<String> stringList1 = List.of("aaa","bbb","ccc","ddd","aaa");
        List<String> stringList2 = List.of("aaa","bbb","ccc","ddd","AAA","BBB","CCC","DDD");

        List<String> list = Stream.
                concat(Stream.of(stringList1), Stream.of(stringList2)).flatMap(Collection::stream)
                .distinct()
                .toList();

        System.out.println(stringList1);
        System.out.println(stringList2);
        System.out.println("___________________________________________");
        System.out.println(list);

    }


}
