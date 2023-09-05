package students.Vkakurin.testModul_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1Demo {
    /*

     Создайте программу-переводчик с английского языка.
      Пользователь вводит слово на английском языке,
       переводчик показывает перевод. Если переводчик
       не обнаружил в словаре введённое слово, то он просит
       пользователя ввести перевод, после чего сохраняет слово
        и его перевод в словарь.
     */
    public static void main(String[] args) {
        Map<String, String> translatorEnglish = new HashMap<>();
        translator(translatorEnglish);
        System.out.println("======================================");
        System.out.println("Конец работы программы");
        System.out.println("Словарь: " + translatorEnglish);
    }

    //метод логики работы переводчика
    public static void translator(Map<String, String> translatorEnglish) {


        Integer closeProgram = 1;
        while (closeProgram == 1) {
            System.out.println("Введите слово на Английском языке :  ");
            //todo написать защиту в методе inPutWord() от набора некорректных данных
            String wordFirst = inPutWord();
            boolean isWordInDictionary = isThisWordInDictionary(translatorEnglish, wordFirst);
            if (!isWordInDictionary) {
                System.out.println("Такого слова нет в словаре! ");
                System.out.println("Введите перевод :  ");
                String wordSecond = inPutWord();
                recordIntoDictionary(translatorEnglish, wordFirst, wordSecond);
                System.out.println(wordFirst + "  ->  " + wordSecond);
                System.out.println("--------------------------------------");
            } else {
                String resultTranslate = outputFromDictionary(translatorEnglish, wordFirst);
                System.out.println(wordFirst + "  ->  " + resultTranslate);
                System.out.println("--------------------------------------");
            }
            System.out.println("Хотите работать со словарем дальше ? ");
            System.out.println("Если да, нажмите " + 1);
            System.out.println("Если нет, нажмите любую клавишу.");
            closeProgram = inPutDigital();
        }
    }


    //Метод ввода слова
    public static String inPutWord() {
        Scanner scanner = new Scanner(System.in);
        String isInputWord = scanner.next();
        return isInputWord;
    }

    //метод ввода цифры
    public static Integer inPutDigital() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        if (!sc.hasNextInt()) {
            System.out.println("Вы не набрали цифру 1");
            System.out.println("Выходим из программы работы со словарем ");
        } else {
            number = sc.nextInt();
            if (number == 1) {
                System.out.println("Спасибо! Вы ввели число " + number);
                System.out.println("Продолжаем!");
                return number;
            } else {
                System.out.println("Извините, но это не число " + 1);
                System.out.println("Выходим из программы работы со словарем ");
                return 0;

            }
        }

        return number;
    }


    // метод проверки наличия слова в словаре
    public static boolean isThisWordInDictionary(Map<String, String> map, String wordEng) {
        boolean check = map.containsKey(wordEng);
        return check;
    }

    //Запись слова "значение" по "ключу" в словарь??
    public static void recordIntoDictionary(Map<String, String> map, String wordEng, String wordRus) {
        map.put(wordEng, wordRus);
    }

    //метод вывода слова "значение" по "ключу" в консоль??
    public static String outputFromDictionary(Map<String, String> map, String wordEng) {
        String value = map.get(wordEng);
        return value;
    }
}