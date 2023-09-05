package students.Vkakurin.lesson_18_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_18_04 {
    // Переведите список строк в список чисел, содержащих длины этих строк, с использованием Java Stream API.
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("asdf","qwere","c","abc","dfhgafh"));
        System.out.println(stringList);
        List<Integer> integerList = stringList.stream().map(String::length).toList();
        System.out.println(integerList);
    }
}
