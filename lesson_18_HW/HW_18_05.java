package students.Vkakurin.lesson_18_HW;

import java.util.List;

public class HW_18_05 {
    //Используя Java Stream API, найдите сумму всех чисел в списке, удовлетворяющих определенному условию.
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,20);// сумма нечетных чисел
        System.out.println(list.stream().
                filter(x -> x % 2 != 0 ).
                mapToInt(Integer::intValue).
                sum());



    }
}
