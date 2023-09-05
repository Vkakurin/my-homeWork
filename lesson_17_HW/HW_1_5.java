package students.Vkakurin.lesson_17_HW;

import java.util.*;

import static java.util.Collections.sort;

public class HW_1_5 {
    /**
     * 1 Создать ArrayList из 10 элементов, отсортировать его по возрастанию и вывести на экран.
     * <p>
     * 2 Создать LinkedList из 10 элементов, удалить элементы с индексами, которые хранятся другой коллекции в Set и вывести на экран, то что останется от List.
     * <p>
     * 3 Создать HashMap, где ключом является число типа Integer, а значением - его квадрат. Вывести на экран все элементы HashMap.
     * <p>
     * 4 Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.
     * <p>
     * 5 Создать TreeMap, где ключом является строка, а значением - ее длина. Вывести на экран все элементы TreeMap.
     * <p>
     */
    public static void main(String[] args) {
        //  1 Создать ArrayList из 10 элементов, отсортировать его по возрастанию и вывести на экран.
        List<Integer> list1 = Arrays.asList(3, 4, 1, 2, 5, 6, 8, 7, 4, 9, 0);
        sort(list1);
        System.out.println("Cортировка");
        System.out.println(  list1);
        System.out.println();
        // 2 Создать LinkedList из 10 элементов, удалить элементы с индексами,
        // которые хранятся другой коллекции в Set и вывести на экран, то что останется от List.

        List<Integer> list2 = new LinkedList<>(Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70, 80, 90));
        System.out.println("Удаление списка по индексом , хранящихся в Set");
        System.out.println(list2);
        Set<Integer> set = Set.of(0, 1, 5, 7);

        System.out.println("" + set);
        for (int i = 0; i < set.size(); i++) {
            list2.remove(i);
        }

        System.out.println( list2);
        System.out.println();
//3 Создать HashMap, где ключом является число типа Integer, а значением - его квадрат.
// Вывести на экран все элементы HashMap.
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            hashMap.put(i, i * i);

        }
        System.out.println(hashMap);
        System.out.println();

        //  4 Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "ada");
        hashMap1.put(2, "dddf");
        hashMap1.put(3, "ggga");
        hashMap1.put(4, "bbbs");
        hashMap1.put(5, "ddgga");
        System.out.println(hashMap1);

        String result = "bbbs";
        boolean isContain = hashMap1.containsValue(result);

        System.out.println("HashMap1 содержит " + result + "? = " + isContain);
        System.out.println();

        //  5 Создать TreeMap, где ключом является строка, а значением - ее длина.
        //  Вывести на экран все элементы TreeMap.
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String[] word = {"fdgfdgj", "ghyu", "weqrwt", "tyritnbcnfk"};
        for (int i = 0; i < word.length; i++) {
            treeMap.put(word[i], Integer.valueOf(word[i].length()));
        }
        System.out.println(treeMap);
        System.out.println();






    }
}

