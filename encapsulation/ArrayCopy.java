package students.Vkakurin.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCopy {
    /*
    Данный метод должен вернуть новый массив, который содержит
только те числа, которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нём.
     */
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] outArr = new int[in.length];
        int element = 0;
        System.out.println(Arrays.toString(in));
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                outArr[element] = in[i];
                element++;
            }
        }
        int[] outToSize = getToSize(outArr, element);
        return outToSize;
    }

    //перезаписать массив ограничив размер только заданным диапазоном
    public int[] getToSize(int[] in, int sizeWithoutZiroElementToEnd) {
        int[] arr = new int[sizeWithoutZiroElementToEnd];
        for (int i = 0; i < sizeWithoutZiroElementToEnd; i++) {
            arr[i] = in[i];
        }
        return arr;
    }
}
