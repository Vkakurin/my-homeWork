package students.Vkakurin.task_12;

/*
do

  swapped = false

  for i = 1 to indexOfLastUnsortedElement-1

    if leftElement > rightElement

      swap(leftElement, rightElement)

      swapped = true; ++swapCounter

while swapped
 */
public class SwappArray {
    public static boolean swappOfelement(int arr[], int element, int counter, boolean swapped) {

        int temp = arr[element];
        arr[element] = arr[element++];
        arr[element++] = temp;
        swapped = true;
        ++counter;
        return swapped;
    }

}
