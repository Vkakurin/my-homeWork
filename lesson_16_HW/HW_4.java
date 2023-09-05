package students.Vkakurin.lesson_16_HW;

import java.util.Arrays;
import java.util.List;

public class HW_4 {
    /**
     * Задача: Вычислить среднее значение списка чисел.
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        int sizeNum = numbers.size();
        for (int i = 0; i < sizeNum; i++) {
            sum += numbers.get(i);
        }
        double average = (double) sum / sizeNum;
        System.out.println("Среднее число: " + average);
    }
}
