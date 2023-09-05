package students.Vkakurin.lesson_19_HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HW_6 {
    /*6) Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
        Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
    */
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("person10", 18, "java"));
        personList.add(new Person("person11", 25, "java"));
        personList.add(new Person("person12", 26, "java"));
        personList.add(new Person("person13", 17, "js"));
        personList.add(new Person("person14", 28, "js"));
        personList.add(new Person("person15", 38, "js"));
        personList.add(new Person("person16", 21, "piton"));
        personList.add(new Person("person17", 28, "piton"));
        personList.add(new Person("person18", 30, "piton"));
        personList.add(new Person("person19", 21, "c++"));
        personList.add(new Person("person20", 27, "c++"));
        personList.add(new Person("person21", 29, "c++"));


        System.out.println(personList);
        List<Person> people = personList.stream().
                filter(person -> person.getAge() > 25).
                sorted(Comparator.comparing(Person::getSkills)).
                toList();
        System.out.println("Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их");
        for (Person p : people) {
            System.out.println(p.getName() + ": age = " + p.getAge()+", skill: " + p.getSkills());
        }


    }

    static class Person {
        String name;
        int age;
        String skills;

        public Person(String name, int age, String skills) {
            this.name = name;
            this.age = age;
            this.skills = skills;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSkills() {
            return skills;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", skills='" + skills + '\'' +
                    '}';
        }
    }
}
