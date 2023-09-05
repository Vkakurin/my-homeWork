package students.Vkakurin.TaskLambda.Homework;

public class Hw4 {
    //Напишите функциональный интерфейс для вычисления факториала числа.
    public static void main(String[] args) {
        Factorial factorial = f -> {
            int result = 1;
            while (f != 1){
                result = result * f;
            f--;
            }
            return result;
        };
        System.out.println(factorial.test(6));
    }

    interface Factorial {
        int test(int x);
    }
}
