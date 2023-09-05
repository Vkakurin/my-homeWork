package students.Vkakurin.lesson_16_HW;


import java.util.Arrays;
import java.util.List;

/**
 * Задача: Преобразовать список строк в список их длин.
 * List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
 */
public class HW_1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
        for (int i = 0; i < words.size(); i++) {
            int temp = 0;
            temp = words.get(i).length();
            words.set(i, Integer.toString(temp));

        }
        System.out.println(words);

    }
}



