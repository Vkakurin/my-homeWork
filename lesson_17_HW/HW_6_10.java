package students.Vkakurin.lesson_17_HW;

import java.util.*;

public class HW_6_10 {
    /*
     * 6 Создать PriorityQueue из 10 элементов типа Integer, добавить несколько элементов, извлечь минимальный элемент и вывести на экран.
     * <p>
     * 7 Создать Stack, добавить в него несколько элементов. ПРоверить есть ли в коллекции заданный элемент. Если есть,то найти его глубину и вывести на экран.
     * <p>
     * 8 Создать ArrayDeque, добавить в него несколько элементов с каждой стороны, извлечь элементы с одной из сторон и вывести на экран.
     * <p>
     * 9 Создать TreeMap, где ключом является число типа Integer, а значением - его факториал. Вывести на экран все элементы TreeMap.
     * <p>
     * 10 Создать HashSet из нескольких элементов, создать LinkedList из тех же элементов и вывести на экран элементы LinkedList в том порядке, в котором они были добавлены.
     */


    public static void main(String[] args) {

        // 6 Создать PriorityQueue из 10 элементов типа Integer, добавить несколько элементов
// извлечь минимальный элемент и вывести на экран.
        Queue<Integer> queue;
        queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(4);
        queue.add(9);
        queue.add(7);
        queue.add(8);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(0);
        queue.add(1);
        System.out.println(queue);
        queue.add(30);
        queue.add(20);
        queue.add(10);
        System.out.println(queue);

        int min = queue.peek();
        System.out.println(" минимальный элемент PriorityQueue  = " + min);
        System.out.println();
        //7 Создать Stack, добавить в него несколько элементов.
        // ПРоверить есть ли в коллекции заданный элемент.
        // Если есть,то найти его глубину и вывести на экран.
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(10);
        System.out.println(stack);
        int item = 4;
        int position = stack.search(4);

        System.out.println("Элемент " + item + "  на позиции " + position + "  от дна стека.");
        System.out.println();

        //8 Создать ArrayDeque, добавить в него несколько элементов с каждой стороны,
        // извлечь элементы с одной из сторон и вывести на экран.
        //
        Deque<Integer> deque = new ArrayDeque();
        deque.add(4);
        deque.add(2);
        deque.add(1);
        deque.add(6);
        deque.add(5);
        deque.add(7);
        System.out.println("Добавил 6 элементов deque        " + deque);
        deque.addFirst(10);
        deque.addLast(15);
        System.out.println("добавил в начало и конец     " + deque);
        deque.removeFirst();
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Удалил два из начала и один с конца " + deque);
        System.out.println();


        //9 Создать TreeMap, где ключом является число типа Integer,
        // а значением - его факториал. Вывести на экран все элементы TreeMap.
        //
        Map<Integer, Integer> treeMap = new TreeMap();
        int[] key = {2, 3, 7, 5, 4, 9, 7, 8};
        for (int i = 0; i < key.length; i++) {
            int keyVal = key[i];
            treeMap.put(keyVal, factorial(keyVal));
        }
        System.out.println("Создать TreeMap, где ключом является число типа Integer,");
        System.out.println("а значением - его факториал.");
        System.out.println(treeMap);
        System.out.println();

        //10 Создать HashSet из нескольких элементов,
        // создать LinkedList из тех же элементов и вывести на экран элементы LinkedList
        // в том порядке, в котором они были добавлены.
        //


        Set<Integer> integerSet = new HashSet<>();
        int[] key1 = {2, 3, 7, 5, 4, 9, 7, 8, 1};
        for (int i = 0; i < key1.length; i++) {
            int keyVal1 = key1[i];
            integerSet.add(keyVal1);
        }
        System.out.println("Создать HashSet из нескольких элементов  " + integerSet);

        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < key1.length; i++) {
            int keyVal1 = key1[i];
            integerList.add(keyVal1);
           // System.out.print(keyVal1 + "\n");
        }
        System.out.print("создать LinkedList из тех же элементов  " + integerList);
    }


// Вычисление факториала для задачи 9.
    public static int factorial(int num) {
        int i = 1;
        int result = 1;
        while (i <= num) {
            result *= i;
            i++;
        }
        return result;
    }


}
