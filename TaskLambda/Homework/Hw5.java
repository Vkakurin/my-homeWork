package students.Vkakurin.TaskLambda.Homework;

import java.awt.*;
import java.util.Arrays;

public class Hw5 {
    //Напишите функциональный интерфейс для вычисления среднего значения списка чисел.
    public static void main(String[] args) {
        AverageList averageList = avg -> {

            int sum = 0;
            for (int i: avg) {
             sum +=i;
            }

            return  (double) sum/avg.length;
        };

        int[] l = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(averageList.testAverage(l));
    }
    interface AverageList{
        double testAverage(int[] list);
    }
}
