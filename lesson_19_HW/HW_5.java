package students.Vkakurin.lesson_19_HW;

import java.util.ArrayList;
import java.util.List;

public class HW_5 {
    //5) из списка студентов сделать сгруппировать данные по году поступления
    public static void main(String[] args) {
        List<HW_1.Student> list1 = new ArrayList<>();
        list1.add(new HW_1.Student("Ivanov", 18, 4.5,2020));
        list1.add(new HW_1.Student("Petrov", 19, 3.8,2021));
        list1.add(new HW_1.Student("Semenov", 21, 4.9,2022));
        list1.add(new HW_1.Student("Sidorov", 20, 4.4,2023));
        list1.add(new HW_1.Student("Popov", 17, 4.8,2019));
        list1.add(new HW_1.Student("Semenova", 20, 5.0,2022));
        System.out.println(list1);
        List<HW_1.Student> st = list1.stream().filter(student -> student.getYearIn()==2022).toList();
        HW_4.PrintStudents(st);


    }
}
