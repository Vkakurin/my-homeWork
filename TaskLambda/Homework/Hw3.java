package students.Vkakurin.TaskLambda.Homework;

public class Hw3 {
    //  Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
    public static void main(String[] args) {
        PolTest polTest;
        polTest = s -> {
            char[] word = s.toCharArray();
            int indexFirst = 0;
            int indexLast = word.length - 1;

            while (indexFirst < indexLast) {
                if (word[indexFirst] != word[indexLast])
                    return false;
                indexFirst++;
                indexLast--;
            }
            return true;
        };


        String s = "asdfggfdsa";
        System.out.println(polTest.test(s));

    }

    interface PolTest {
        boolean test(String s);
    }


}
