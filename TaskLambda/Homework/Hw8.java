package students.Vkakurin.TaskLambda.Homework;

public class Hw8 {
    //Напишите функциональный интерфейс для проверки, является ли число простым.
    public static void main(String[] args) {
        Simple simple = x -> {
            boolean flag = false;
            if (x % 1 == 0 || x % x == 0) {
                flag = true;
            }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                }
            }

            return flag;
        };
        int num = 11;
        System.out.println("Число " + num + "  простое?  -" + simple.test(num));
    }

    interface Simple {
        boolean test(int x);
    }

}
/**
 * for(int i = 2; i <= 100; i ++){
 * boolean isPrime = true;
 * <p>
 * for(int j = 2; j < i; j++){
 * if(i % j == 0){
 * isPrime = false;
 * break;
 * }
 * }
 * <p>
 * if(isPrime){
 * System.out.println(i);
 * }
 * }
 */