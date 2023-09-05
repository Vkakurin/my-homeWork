package students.Vkakurin.lesson_18_HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HW_18_07 {
    //Сгруппируйте список объектов по определенному полю, используя Java Stream API, и выполните определенную операцию на каждой группе.

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Ivanov",20,1900.0));
        personList.add(new Person(2,"Petrov",21,1500.0));
        personList.add(new Person(3,"Popov",30,2500.0));
        personList.add(new Person(4,"Sidorov",27,2050.0));
        personList.add(new Person(5,"Semenova",25,2200.0));
        System.out.println("вывести имя пeрсоны с наибольшим id: " + personList.stream().
                max(Comparator.comparingInt(Person::getId)).
                get().name);
        System.out.println("Отсортировать по увеличению зарплаты : " + personList.stream().
                sorted(Comparator.comparingDouble(Person::getSalary)).
                toList());
        System.out.println("сортировка по возрасту старшие-младшие : " + personList.stream().
                sorted(Comparator.comparingInt(Person::getAge).reversed()).
                toList());



    }

    static class Person{
        Integer id;
        String name;
        Integer age;
        Double salary;

        public Person(Integer id, String name, Integer age, Double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
