package students.Vkakurin.lesson_16_HW;

import java.util.Arrays;
import java.util.List;

public class HW_3 {
    /**
     * Задача: Фильтровать список строк по заданному условию(в порядке увеличения  длины слов).
     List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
     *
     */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
         words.sort(((o1, o2) -> {
             return o1.length()-o2.length();}));
        System.out.println(words);
    }
}
