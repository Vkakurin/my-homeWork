package students.Vkakurin.task_12;

import java.util.Arrays;


public class ArrayService {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9, 4, 5, 5, 0, 1, 4};

        int numberToSearch = 5;
        int numberToReplace = 7;
        int newNumberForFirstReplace = 0;
        // System.out.println("Число  " + numberToSearch + "  содержится в массиве? " + contains(arr, numberToSearch));

        //countToInt(arr, numberToSearch);
        replaceFirst(arr, numberToReplace, newNumberForFirstReplace);
        System.out.println("                      " + Arrays.toString(arr));
        revert(arr);
        sortBubble(arr);
        // System.out.println(Arrays.toString(arr));
    }

    static boolean contains(int[] arr, int numberToSearch) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                result = true;
                break;
            } else {

            }
        }
        return result;
    }


    static void countToInt(int arr[], int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("нет числа " + numberToSearch + " в массиве ");
        } else {
            System.out.println("Число " + numberToSearch + " встречается " + count + " раз(а)");
        }

    }

    // замена заданного числа массива на новое
    static boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                isPresent = true;
                arr[i] = newNumber;
                break;
            }
        }
        if (!isPresent) {
            System.out.println(" число " + numberToReplace + " отсутствует в массиве !!!");
        } else {
            System.out.println(" число " + numberToReplace + " в массиве заменено на " + newNumber);
        }

        return false;
    }


    // разворот массива
    static void revert(int[] arr) {
        int temp = 0;
        int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;

        }
        System.out.println("перевернуть массив    " + Arrays.toString(arr));
    }

    public static void sortBubble(int arr[]) {
    /*
       do
  swapped = false
  for i = 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap(leftElement, rightElement)
      swapped = true; ++swapCounter
while swapped
      */

        int tmp = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            int j = 1;
            if (j < arr.length - 1) {
                bubbleSortToOnePass(arr, j, tmp);
            }
        }
        System.out.println("Осортированный массив " + Arrays.toString(arr));

    }

    public static void bubbleSortToOnePass(int arr[], int j, int temp) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

    }

}







