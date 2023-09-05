package students.Vkakurin.lesson_19_HW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW_3 {
    //3) коллекция string - получить строку содержащую все элементы этой коллекции
    public static void main(String[] args) {
        List<String> listStr = List.of("aa", "sss", "d", "fdcvffa", "ff", "ffff", "ffgg", "hh", "jjjjjjj");
        System.out.println(listStr);
        System.out.println(String.join(" ", listStr));


    }



}
