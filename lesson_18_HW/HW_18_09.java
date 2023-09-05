package students.Vkakurin.lesson_18_HW;

import java.util.List;

public class HW_18_09 {
    //Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование, с использованием Java Stream API.
    public static void main(String[] args) {
         List<Integer> list = List.of(20, 1, 2, 3, 4, 0, 5, 6, 50, 7, 8, 9, -5);
        List<Integer> newList = list.stream().map(s-> s + 5).toList();
        System.out.println(newList);
    }

}
