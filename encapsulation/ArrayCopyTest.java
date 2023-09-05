package students.Vkakurin.encapsulation;

import java.util.Arrays;
import java.util.List;

public class ArrayCopyTest {
    public static void main(String[] args) {
        /*

         */
       int[] arrayToPartCopy = {1,2,3,4,5,5,6,7,8,9,0,10,11,12,13,5,0};
        int numberFrom = 0;
        int numberTo = 10;
       ArrayCopy arrayCopy = new ArrayCopy();
       int[] resultOfCopy =arrayCopy.copyInRange(arrayToPartCopy,numberFrom,numberTo);
        System.out.println(Arrays.toString(resultOfCopy));
    }
}
