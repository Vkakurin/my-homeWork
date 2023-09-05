package students.Vkakurin.TaskLambda.Homework;

public class Hw6 {
    //Напишите функциональный интерфейс для сравнения двух строк на основе их длины.
    public static void main(String[] args) {
        LengthComp lengthComp = (x, y) -> {
            boolean result = x.length() == y.length();
            return result;
        };
        String s1 = "12345678";
        String s2 = "12345679";
        System.out.println("Строки равной длинны ? - " + lengthComp.test(s1,s2));
    }

    interface LengthComp {
        boolean test(String a, String b);
    }
}
