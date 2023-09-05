package students.Vkakurin.lesson_19_HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HW_4 {
    // 4) В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления
    public static void main(String[] args) {


        List<HW_1.Student> list1 = new ArrayList<>();
        list1.add(new HW_1.Student("Ivanov", 18, 4.5,2020));
        list1.add(new HW_1.Student("Petrov", 19, 3.8,2021));
        list1.add(new HW_1.Student("Semenov", 21, 5.0,2022));
        list1.add(new HW_1.Student("Sidorov", 20, 4.4,2023));
        list1.add(new HW_1.Student("Popov", 17, 4.8,2019));
        list1.add(new HW_1.Student("Semenova", 20, 5.0,2022));
        System.out.println(list1);
        List<HW_1.Student> studentList = list1.stream().
                sorted(Comparator.comparingDouble(HW_1.Student::getAvgGrade).reversed()).
                limit(3).
                sorted(Comparator.comparingInt(HW_1.Student::getYearIn)).
                toList();
        System.out.println("списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления");
        PrintStudents(studentList);
    }
public static void PrintStudents(List<HW_1.Student> studentList){
    for (HW_1.Student st : studentList) {
        System.out.println(st.getName() + ", yearIn = " + st.getYearIn() + ", avgGrade = " + st.getAvgGrade());
    }

}
}
