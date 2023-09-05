package students.Vkakurin.lesson_18_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_18_03 {
    //Найдите количество уникальных элементов в списке, используя Java Stream API.
    public static void main(String[] args) {
        List<Integer> countUnique = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,3,4,5,6));
        System.out.println(countUnique.stream().distinct().count());
    }
}
