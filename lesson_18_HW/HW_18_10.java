package students.Vkakurin.lesson_18_HW;

import java.util.List;

public class HW_18_10 {
    // Используя Java Stream API, выполните операцию "свертки" (reduce) на списке чисел, чтобы найти сумму,
    // произведение или другую агрегатную функцию.
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2,3,4,5,1);
        System.out.println(integerList.stream().reduce(0,(a,b)-> a + b  ));
        System.out.println(integerList.stream().reduce(1,(a,b)-> a * b  ));
        System.out.println(integerList.stream().reduce(0,(a,b)-> a - b  ));
    }

}
