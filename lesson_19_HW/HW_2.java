package students.Vkakurin.lesson_19_HW;

import java.util.List;
import java.util.stream.Collectors;

public class HW_2 {
    //2) коллекция string  - получить коллекцию элементов у которых нечетной количество символов

    public static void main(String[] args) {
        List<String> list = List.of("aa", "sss", "d", "fdcvffa", "ff", "ffff", "ffgg", "hh", "jjjjjjj");
        List<String> oddList = list.stream().
                filter(s -> s.length() % 2 != 0).
                toList();
        System.out.println(oddList);


    }
}
