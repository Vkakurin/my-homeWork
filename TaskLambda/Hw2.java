package students.Vkakurin.TaskLambda;

public class Hw2 {


    //Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
    public static void main(String[] args) {
        SumTwoIntNum sumTwoIntNum;
        sumTwoIntNum = (a, b) -> a + b;
        System.out.println(sumTwoIntNum.sum(3, 6));


    }

    interface SumTwoIntNum {
        int sum(int x, int y);
    }
}
