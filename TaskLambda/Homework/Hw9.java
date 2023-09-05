package students.Vkakurin.TaskLambda.Homework;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Hw9 {
    // Напишите функциональный интерфейс для получения списка строк, начинающихся с определенной буквы.
    public static void main(String[] args) {
        ToUpLetter toUpLetter = (l,letter)->{
            List<String> str = new ArrayList<>();

            for (String s:l) {
                if (s.startsWith(String.valueOf(letter)))
                    str.add(s);
            }
            return str;
        };
        String[] list ={"ssts","kjki","hgdhgd","dsasd","styt","dsfd","ytyiti"};
        System.out.println(toUpLetter.test(list,'y'));
    }
    interface ToUpLetter{
        List test (String[] list, Character letter);
    }
}
