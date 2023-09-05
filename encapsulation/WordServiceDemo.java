package students.Vkakurin.encapsulation;

import java.util.*;

public class WordServiceDemo {
    public static void main(String[] args) {

        // 1.вариант с Set
        String text = "e r b k c f d se a a a k f g a d f s s f d s ft gh a f ws w a f";
        String text1 = "This testing Program testing is Program is testing This is word";

        List<String> list = Arrays.asList(text.split("\\s"));
     //   getUniqueWord(list);
        System.out.println("================================");
        // 2.вариант с map

       // getUniqueWord1(text1);

        //3.вариант с двумя fori and equals
       // getUniqueWord2(text1);

        WordService wordService = new WordService();
        String resalt = wordService.findMostFrequentWord(text1);
        System.out.println(resalt);


    }

    public static void getUniqueWord(List<String> stringList) {
        Set<String> uniqWords = new HashSet<>(stringList);
        Integer temp = Integer.MIN_VALUE;
        for (String word : uniqWords) {
            Integer counterWords = Collections.frequency(stringList, word);
            if (counterWords > temp) {
                temp = counterWords;//максимум повторений слова
            }
        }
        findFirstRepWord(stringList,temp);

    }
    // по простому  ищем первое максимальное повторение слов в массиве стринга
    public static void findFirstRepWord(List<String> stringList , int maxRepead){
        for (String str : stringList) {
            int counter = (Collections.frequency(stringList, str));
            if (counter == maxRepead) {
                System.out.println("Первое слово с максимальным повторением "+ str + ": " + counter);
                break;
            }
        }
    }






    public static void getUniqueWord1(String txt) {
        String[] item = txt.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        Integer temp = Integer.MIN_VALUE;
        ;
        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
            Integer max = map.get(t);
            if (max > temp) {
                temp = map.get(t);//максимум повторений слова
            }

        }




      Set<String> keys = map.keySet();
        for (String key : keys) {

            System.out.print(key + " = ");
            System.out.println(map.get(key));

        }
       // System.out.println("Первое слово с максимальным повторением   " + temp);
        System.out.println("количество уникальных слов : " + keys.size());
        System.out.println("=====================================");
    }


    public static void getUniqueWord2(String st) {
        String[] ar = st.split("\\s");
        Map<String, Integer> mp = new HashMap<String, Integer>();
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            count = 0;

            for (int j = 0; j < ar.length; j++) {
                if (ar[i].equals(ar[j])) {
                    count++;
                }
            }

            mp.put(ar[i], count);
        }

        System.out.println(mp);
    }

    public static void foundMax(String name, int num) {
        int maxComp = Integer.MAX_VALUE;
        int temp = 0;
        if (num < maxComp) {
            temp = num;
        }
    }
}

