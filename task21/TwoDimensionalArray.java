package students.Vkakurin.task21;

import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {
/*
    - создайте двумерный массив;
    - заполните двумерный массив случайными числами;
    - посчитайте сумму всех чисел в двумерном массиве.
 */

        //  int[][] arrayTwo = {{1, 2, 3, 4}, {11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};
        //   printArrayTwo(arrayTwo);
        //   System.out.println();
        arrayRandomTwo(5, 5);
    }

    public static void arrayRandomTwo(int arrRow, int arrColumn) {
        int sum = 0;
        int[][] ar1 = new int[arrRow][arrColumn];
        for (int i = 0; i < arrRow; i++) {
            for (int j = 0; j < arrColumn; j++) {
                int temp = (int) (Math.random() * 40);
                ar1[i][j] = temp;
                sum += temp;
            }
        }
        printArrayTwo(ar1);
        System.out.println("Сумма всех чисел массива SUM = " + sum);

    }

    public static void printArrayTwo(int[][] arrayTwo) {
        for (int[] arr : arrayTwo) {
            System.out.println(Arrays.toString(arr));
        }
    }
//    void prem (String str, String prefix){
//        if(str.length()==0){
//            System.out.println(prefix);
//        }else {
//            for (int i = 0; i < str.length(); i++) {
//
//            }
//        }
//
//    }
}
