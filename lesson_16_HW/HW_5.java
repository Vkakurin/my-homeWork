package students.Vkakurin.lesson_16_HW;

import java.util.Arrays;
import java.util.List;

public class HW_5 {
    public static void main(String[] args) {
        /**
         * Задача: Фильтровать список строк по заданному условию.
         List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
         *
         */
        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
        words.stream().filter(e -> e.length() > 5).
                forEach(System.out::println);


    }

}
