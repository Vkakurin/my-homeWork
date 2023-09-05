package students.Vkakurin.lesson_17_HW;


import java.sql.Time;
import java.util.*;


public class Collection_3_lesson_17 {


    public static void main(String[] args) {
        System.out.println("_____________6_____________");
        //  6   Создать множество TreeSet и добавить в него несколько объектов класса Point, у которых есть свойства x и y.
        // Затем перебрать все элементы множества и вывести на консоль только те точки, у которых x > y.
        Set<Point> set = new TreeSet<>();
        set.add(new Point(1, 0));
        set.add(new Point(2, 5));
        set.add(new Point(6, 9));
        set.add(new Point(8, 7));
        set.add(new Point(4, 3));
        set.add(new Point(9, 8));
        set.add(new Point(2, 1));
        System.out.println(set);
        for (Point point : set) {
            if (point.getX() > point.getY()) {
                System.out.println(point.getX() + "  >  " + point.getY());
            }

        }
        System.out.println("____________7______________");
        // 7   Создать отображение LinkedHashMap, где ключом является объект Time (время), а значением - список строк.
        //  Затем добавить несколько строк в список для каждого времени и вывести все элементы
        //  отображения на консоль в порядке возрастания времени.

        Map<Time, List<String>> listMap = new LinkedHashMap<>();
        listMap.put(new Time(12, 05, 00), List.of("adsd", " qewe", "fghfgg"));
        listMap.put(new Time(12, 02, 00), List.of("dgf", " qfdewe", "ffdgg", "jgfhj"));
        listMap.put(new Time(12, 06, 00), List.of("ajksd", " qewke", "fghg", "jkklj", "uiu"));
        listMap.put(new Time(12, 04, 00), List.of("akdsd", " qekwe", "fggk", "jkklj", "ds", "gsgdg"));
        for (Map.Entry<Time, List<String>> list : listMap.entrySet()) {
            System.out.println(list.getKey() + "   " + list.getValue());
        }
        System.out.println();
        List<Time> times = new ArrayList<>(listMap.keySet());
        Collections.sort(times);
        for (Time t : times) {
            System.out.println(t + "      " + listMap.get(t));
        }
        System.out.println("_______________8________________");
        // 8  Создать множество HashSet и добавить в него несколько строк. Затем создать второе множество и добавить в него
        //те же самые строки, но в другом порядке. Затем вывести на консоль только те строки, которые есть в обоих множествах.
        Set<String> stringSet1 = new HashSet<>(Arrays.asList("qqq", "www", "eee", "rrr", "ttt"));
        System.out.println("Set1 :" + stringSet1);
        Set<String> stringSet2 = new HashSet<>(Arrays.asList("ttt", "eee", "rrr", "qqq", "www"));
        System.out.println("Set2 :" + stringSet2);
        for (String s : stringSet1)
            stringSet2.add(s);
        System.out.println("Set2 получен добавлением элементов к нему Set1: " + stringSet2);
        System.out.println("________________9________________");

        //  9   Создать отображение HashMap, где ключом является объект класса Country, а значением - список строк
        // (названия городов в этой стране). Затем добавить несколько городов для каждой страны и
        // вывести все страны на консоль в алфавитном порядке.
        Map<Country, List<String>> map = new HashMap<>();
        Country country1 = new Country("Germany");
        Country country2 = new Country("Belarus");
        Country country3 = new Country("Italy");


        List<String> list1 = new ArrayList<>(List.of("Bonn", "Koln", "Berlin", "Munkhen"));
        List<String> list2 = new ArrayList<>(List.of("Minsk", "Brest", "Lutsk", "Rovno"));
        List<String> list3 = new ArrayList<>(List.of("Roma", "Milan", "Palermo", "Napoly"));

        map.put(country1, list1);
        map.put(country2, list2);
        map.put(country3, list3);
        System.out.println(map);
        list1.add("Drezden");
        list1.add("Gamburg");
        list2.add("Gomel");
        list2.add("Mogilev");
        list3.add("Parma");
        list3.add("Torino");
        System.out.println(map);
        System.out.println("Страны в алфовитном порядке: ");
        List<String> countries = new ArrayList<>();
        for (Map.Entry<Country, List<String>> listEntry : map.entrySet()) {
            countries.add(listEntry.getKey().getName());
        }
        Collections.sort(countries);
        for (String c : countries) {
            for (Map.Entry<Country, List<String>> m : map.entrySet()) {
                if (m.getKey().getName().equals(c)) {
                    System.out.println(m.getKey().getName() + " : " + m.getValue());

                }
            }

        }
        System.out.println("_________________10_______________");
        /*   10  Создать класс Employee со свойствами name, department и salary, затем создать отображение TreeMap,
     где ключом является отдел, а значением - список сотрудников, работающих в этом отделе.
     Затем добавить несколько сотрудников в каждый отдел и вывести на консоль среднюю зарплату для каждого отдела.
     */
        Map<String, List<Employee>> map1 = new HashMap<>();
        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(new Employee("Ivanov", "Frontend", 2000));
        employeeList1.add(new Employee("Petrov", "Backend", 1800));
        employeeList1.add(new Employee("Sidorov", "QA", 1750));
        map1.put("IT", employeeList1);

        List<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(new Employee("Ivanov2", "Frontend", 1850));
        employeeList2.add(new Employee("Petrov2", "Backend", 1900));
        employeeList2.add(new Employee("Sidorov2", "QA", 1650));
        map1.put("DF", employeeList2);
        printMap(map1);
        System.out.println();
        System.out.println("Средняя зарплата отдела DF: " + averageSalary(employeeList2));
        System.out.println("Средняя зарплата отдела IT: " + averageSalary(employeeList1));

    }

    public static double averageSalary(List<Employee> employee) {
        double sum = 0;
        for (Employee s : employee) {
            sum += s.getSalary();
        }
        return sum / employee.size();
    }

    public static void printMap(Map<String, List<Employee>> map) {
        for (Map.Entry<String, List<Employee>> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}


