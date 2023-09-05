package students.Vkakurin.lesson_17_HW;

import java.util.*;

public class Collection_2_lesson_17 {
    /**
     * 1   Создать класс Student со свойствами name и grade (оценка), затем создать список ArrayList,
     * заполнить его несколькими объектами Student и отсортировать список по оценке в порядке убывания.
     */
    public static void main(String[] args) throws InterruptedException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", 3));
        students.add(new Student("Petrov", 4));
        students.add(new Student("Sidorov", 5));
        students.add(new Student("Popov", 2));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);


   /*
     2   Создать отображение TreeMap, где ключом является объект Date (дата), а значением - список строк.
     Затем добавить несколько строк в список для каждой даты и вывести все элементы отображения на консоль в порядке возрастания даты.
   */
        System.out.println();
        List<String> stringList = new ArrayList<>(Arrays.asList("jhgjh", "fddsf", "eqqre"));
        Map<Date, List<String>> treeMaps = new TreeMap<>();

        System.out.println(stringList);
        System.out.println();
        treeMaps.put(new Date(), stringList);//1
        System.out.println(treeMaps);


        int index = stringList.size();
        stringList.add(index, "111111");
        Thread.sleep(2000);
        treeMaps.put(new Date(), stringList);//2
        System.out.println(treeMaps);
        index++;
        stringList.add(index, "222222");
        Thread.sleep(2000);
        index++;
        treeMaps.put(new Date(), stringList);//3
        Thread.sleep(2000);
        treeMaps.put(new Date(), stringList);
        System.out.println(treeMaps);



   /*  3   Создать множество LinkedHashSet и добавить в него несколько объектов класса Person, у которых есть свойства name и age.
     Затем перебрать все элементы множества и вывести на консоль только тех людей, возраст которых меньше 30 лет.
   */
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("Ivanov", 25));
        linkedHashSet.add(new Person("Petrov", 32));
        linkedHashSet.add(new Person("Sidorov", 30));
        linkedHashSet.add(new Person("Popov", 22));
        System.out.println();
        System.out.println(linkedHashSet);
        System.out.println();
        for (Person per : linkedHashSet) {
            if (per.getAge() < 30) {
                System.out.println("Person younger then 30:" + per);
            }
        }
        System.out.println();
        //  4   Создать очередь PriorityQueue и добавить в нее несколько элементов, у которых есть свойства name и priority.
        //  Затем извлечь элементы из очереди в порядке приоритета и вывести их на консоль.
        Queue<PersonInQue> queue = new PriorityQueue<>();
        queue.add(new PersonInQue("AA", 1));
        queue.add(new PersonInQue("CC", 3));
        queue.add(new PersonInQue("DD", 5));
        queue.add(new PersonInQue("FF", 7));
        queue.add(new PersonInQue("BB", 2));
        queue.add(new PersonInQue("EE", 6));
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();

        //  5   Создать класс Book со свойствами title, author и year (год издания), затем создать список LinkedList, заполнить
        //  его несколькими объектами Book и удалить из списка все книги, которые были изданы до 2000 года.
        List<Book> books = new LinkedList<>();
        books.add(new Book("AA", "A", 1999));
        books.add(new Book("BB", "B", 2020));
        books.add(new Book("CC", "C", 1980));
        books.add(new Book("EE", "E", 1976));
        books.add(new Book("FF", "F", 1983));
        books.add(new Book("GG", "G", 2010));
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()) {
            if (itr.next().getYearIss() < 2000) {
                itr.remove();
            }
        }
        System.out.println("Book after 2000: " + books);
    }







}
