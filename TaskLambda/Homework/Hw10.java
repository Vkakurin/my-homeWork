package students.Vkakurin.TaskLambda.Homework;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Hw10 {
    //Напишите функциональный интерфейс для объединения двух списков в один.
    public static void main(String[] args) {
        UnionTwoList unionTwoList = (x, y) -> {
            List listUnion = new List();
            for (String s1 : x) listUnion.add(s1);
            for (String s2 : y) listUnion.add(s2);
            return listUnion;
        };
        java.util.List<String> list1 = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
        java.util.List<String> list2 = new ArrayList<>(Arrays.asList("www", "eee", "rrr", "ttt", "yyy"));
        System.out.println(list1);
        System.out.println(list2);
        List union = unionTwoList.union(list1, list2);

        for (String s1 : union.getItems()) {
            System.out.print(s1 + " ");
        }
    }

    interface UnionTwoList {
        List union(java.util.List<String> list1, java.util.List<String> list2);
    }

}
