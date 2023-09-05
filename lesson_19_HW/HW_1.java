package students.Vkakurin.lesson_19_HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class HW_1 {
    /*    1) Фильтрация списка студентов по возрасту и со средним баллом больше 4.5
        Student {
            String name;
            int age;
            double avgGrade;
        }

    2) коллекция string  - получить коллекцию элементов у которых нечетной количество символов

    3) коллекция string - получить строку содержащую все элементы этой коллекции

    4) В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления

    5) из списка студентов сделать сгруппировать данные по году поступления

    6) Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
        Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их

    7) Дана коллекция Product - название, категория, цена, количество на складе.
        Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
        и отсортировать по убыванию цены

    8) Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
        Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.

    9) Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
        Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.


    10) Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
        Необходимо получить список всех уникальных тегов
        */
    public static void main(String[] args) {
        //  1) Фильтрация списка студентов по возрасту и со средним баллом больше 4.5
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivanov", 18, 4.5,2020));
        studentList.add(new Student("Petrov", 19, 3.8,2021));
        studentList.add(new Student("Semenov", 21, 5.0,2022));
        studentList.add(new Student("Sidorov", 20, 4.4,2023));
        studentList.add(new Student("Popov", 17, 4.8,2019));
        System.out.println(studentList);
        List<Student> list = studentList.stream().
                filter(student -> student.getAvgGrade() >= 4.5 && student.getAge() >= 18).
                toList();
        System.out.println("Фильтрация списка студентов по возрасту(БОЛЬШЕ 18))и со средним баллом больше 4.5");
        for (Student st : list) {
            System.out.println(st.getName() + ", age = " + st.getAge() + ", avgGrade = " + st.getAvgGrade());
        }

    }

    static class Student {
        String name;
        int age;
        double avgGrade;
        int yearIn;

        public Student(String name, int age, double avgGrade, int yearIn) {
            this.name = name;
            this.age = age;
            this.avgGrade = avgGrade;
            this.yearIn = yearIn;
        }

        public int getYearIn() {
            return yearIn;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getAvgGrade() {
            return avgGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", avgGrade=" + avgGrade +
                    ", yearIn=" + yearIn +
                    '}';
        }
    }



}
