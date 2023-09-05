package students.Vkakurin.lesson_19_HW;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HW_8 {

    // 8) Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
    //        Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivanov", 30, "male", 2100.0));
        personList.add(new Person("Ivanova", 25, "female", 2400.0));
        personList.add(new Person("Petrov", 24, "male", 2500.0));
        personList.add(new Person("Ivanov2", 28, "male", 2600.0));
        personList.add(new Person("Ivanov3", 22, "male", 2700.0));
        personList.add(new Person("Ivanov4", 27, "male", 2800.0));
        personList.add(new Person("Petrova", 35, "female", 2900.0));
        personList.add(new Person("Ivanov5", 46, "male", 2200.0));
        personList.add(new Person("Ivanov6", 35, "male", 2050.0));
        personList.add(new Person("Popova", 30, "female", 2150.0));

        System.out.println( "Средняя зарплата мужчин возраста 25-40 лет = " + personList.stream().
                filter(person -> person.getGender().equals("male") && person.getAge() >= 25 && person.getAge()<=40).
                collect(Collectors.averagingDouble(Person::getSalary)));


    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter

    static class Person {
        private String name;
        private Integer age;
        private String gender;
        private Double salary;
    }
}
