package students.Vkakurin.TaskLambda.Homework;

public class Hw7 {
    //Напишите функциональный интерфейс для вычисления корня квадратного из числа.
    public static void main(String[] args) {
        Root root = n -> {
        double rootOfNumber =  Math.sqrt(n);
        return rootOfNumber;
        };
        double num = 25;
        System.out.println("Квадратный корень числа: " + num + "  равен  " + root.result(num));
    }
    interface Root{
        double result(double num);
    }
}
