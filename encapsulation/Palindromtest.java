package students.Vkakurin.encapsulation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".
 */
public class Palindromtest {
    public static void main(String[] args) {
        String[] stringList = {"racecar", "level", "sum summus mus", "А роза упала на лапу Азора", "testABc95j59CBAtset"};
        Palindrom palindrom = new Palindrom();
        Map<String,Boolean> palend = palindrom.isPalindrome(stringList);
        System.out.println("Слова палендромы  = " + palend);
    }
}
