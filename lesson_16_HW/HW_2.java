package students.Vkakurin.lesson_16_HW;
/*
Задача: Найти максимальный элемент в списке чисел.
List<Integer> numbers = Arrays.asList(1, 2, 6, 3, 4, 5);
 */

import java.util.Arrays;
import java.util.List;

public class HW_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 6, 3, 4, 5);
        Integer max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i))
                max = numbers.get(i);
        }
        System.out.println(max);
    }

}

