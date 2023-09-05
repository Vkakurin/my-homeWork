package students.Vkakurin.lesson_18_HW;

import java.util.List;

public class HW_18_08 {
    // Используя Java Stream API, найдите максимальное и минимальное значение в списке чисел одновременно.
    public static void main(String[] args) {
        List<Integer> list = List.of(20, 1, 2, 3, 4, 0, 5, 6, 50, 7, 8, 9, -5);

        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);
        System.out.println("минимальный элемент = " + sortedList.get(0));
        System.out.println("максимальный элемент = " + sortedList.get(list.size() - 1));


    }


}
