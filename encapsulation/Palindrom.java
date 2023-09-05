package students.Vkakurin.encapsulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Palindrom {

    Map<String, Boolean> isPalindrome(String[] text) {
        boolean result = false;
        Map<String, Boolean> map = new HashMap<>();
        for (String str : text) {
            //String[] word = str.split(", ");
            char[] arr = str.toCharArray();
            int j = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    result = true;
                    j--;
                } else {
                    result = false;
                    break;
                }
            }
            map.put(str, result);
        }
        return map;
    }
}

