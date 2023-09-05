package students.Vkakurin.lesson_18_HW;

import java.util.List;
import java.util.stream.Collectors;

public class HW_18_06 {
    //Отфильтруйте список объектов, исключив из него все объекты, не соответствующие определенному критерию, с использованием Java Stream API.
    public static void main(String[] args) {
        List<String> stringList = List.of("kjkl","Asdsf","fgh","djgjk","hhj","Ayyiyi","yri");// Исключаются все строки, которые не начинaются с А или d
        System.out.println(stringList);
        List<String> stringList1;
        stringList1 = stringList.stream().
                filter(s -> s.startsWith("A")||s.startsWith("d")).collect(Collectors.toList());


        System.out.println("строки которые начинаются с А или d : " + stringList1);
    }
}
