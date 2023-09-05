package students.Vkakurin.lesson_17_function;

import java.util.*;
import java.util.function.*;

@SuppressWarnings("rawtypes")
public class HW_1F {
    //   1.    Найти максимальный элемент в списке целых чисел, используя интерфейс Function:
    // 2.    Отфильтровать список строк, оставив только те, которые начинаются с определенной буквы, используя интерфейс Predicate:
    // 3.    Изменить список строк, заменив все символы в нижнем регистре на символы в верхнем регистре, используя интерфейс UnaryOperator:
    // 4.    Сложить два списка целых чисел поэлементно, используя интерфейс BinaryOperator:
    // 5.    Создать список строк, содержащий только уникальные элементы из двух списков, используя интерфейсы Function и Predicate:
    //  6.    Найти среднее арифметическое из списка чисел, используя интерфейсы Function и Consumer:
    //  7.    Отсортировать список строк в обратном алфавитном порядке, используя интерфейсы Comparator и Function:
    // 8.    Преобразовать список строк в список их длин, используя интерфейсы Function и Supplier:
    //  9.    Произвести операцию над всеми элементами списка строк, используя интерфейсы Consumer и Function:
    //   10.    Проверить, все ли элементы списка целых чисел являются положительными, используя интерфейсы Predicate и Function:


    public static void main(String[] args) {
        System.out.println("1.Найти максимальный элемент в списке целых чисел, используя интерфейс Function:");
        List<Integer> integerList = Arrays.asList(4, 6, 8, 9, 20, 3, 4, 5);
        Function<List<Integer>, Object> max = m -> {
            int maxElement = Integer.MIN_VALUE;
            for (int el : m) {
                if (maxElement < el) {
                    maxElement = el;
                }
            }
            return maxElement;
        };
        System.out.println(max.apply(integerList));

        System.out.println("2.Отфильтровать список строк, оставив только те,\n" +
                "которые начинаются с определенной буквы, используя интерфейс Predicate:");

        List<String> stringList = new ArrayList<>(List.of("Dee", "waa", "Dhh", "vhh", "wjj"));
        System.out.println(stringList);
        Predicate<String> stringPredicate = s -> s.startsWith("D");


        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            if (!stringPredicate.test(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println(stringList);

        System.out.println("3.Изменить список строк, заменив все символы в нижнем регистре \n" +
                " на символы в верхнем регистре, используя интерфейс UnaryOperator:");
        UnaryOperator<List<String>> up = e -> {
            List<String> tmp = new ArrayList<>();
            for (String s : e) {
                tmp.add(s.toUpperCase());
            }
            e = tmp;
            return e;
        };
        System.out.println(stringList);
        System.out.println(up.apply(stringList));


        System.out.println("4.    Сложить два списка целых чисел поэлементно, используя интерфейс BinaryOperator:");
        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(7, 6, 3, 6, 1, 2));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(3, 4, 7, 4, 9, 8, 68));


        BinaryOperator<List<Integer>> sumTwoList = (a, b) -> {
            List<Integer> resultSum = new ArrayList<>();
            int size1 = integerList1.size();
            int size2 = integerList2.size();

            if (size1 <= size2) {
                for (int i = 0; i < size1; i++) {
                    resultSum.add(integerList1.get(i) + integerList2.get(i));
                }
                for (int i = size1; i < size2; i++) {
                    resultSum.add(integerList2.get(i));
                }
            } else {
                for (int i = 0; i < size2; i++) {
                    resultSum.add(integerList1.get(i) + integerList2.get(i));
                }
                for (int i = size2; i < size1; i++) {
                    resultSum.add(integerList1.get(i));
                }
            }

            return resultSum;

        };
        System.out.println(sumTwoList.apply(integerList1, integerList2));
        System.out.println();

        System.out.println("5.Создать список строк, содержащий только уникальные \n" +
                "элементы из двух списков, используя интерфейсы Function и Predicate:");
        Consumer<String> print = p -> System.out.println(p);
        Function<List<String>, List<String>> uniqueString = u -> {
            List<String> result = new ArrayList<>();
            for (String str : u) {
                if (!result.contains(str)) result.add(str);
            }
            return result;
        };

        List<String> stringList1 = new ArrayList<>(List.of("Dee", "waa", "Dhh"));
        List<String> stringList2 = new ArrayList<>(List.of("dFg", "Dee", "waa", "Dhh", "krr"));
        System.out.println("List1:" + stringList2);
        System.out.println("List2:" + stringList1);
        List<String> newCollection = new ArrayList<>();
        newCollection.addAll(stringList1);
        newCollection.addAll(stringList2);
        System.out.println("UnionList:" + newCollection);
        System.out.println("Result FilterUnique  :");
        print.accept(uniqueString.apply(newCollection).toString());
        System.out.println();


        System.out.println("6.    Найти среднее арифметическое из списка чисел, используя интерфейсы Function и Consumer:");

        Consumer<Double> avg = x -> System.out.println(x);
        Function<List<Integer>, Double> average = a -> {
            double sum = 0;
            for (Integer i : a) sum += i;

            return sum / a.size();
        };
        System.out.println(integerList1);
        System.out.println("Среднее значение:");
        avg.accept(average.apply(integerList1));
        System.out.println();
        System.out.println("7.Отсортировать список строк в обратном алфавитном " +
                "порядке, используя интерфейсы Comparator и Function:");
        List<String> stringList3 = new ArrayList<>(Arrays.asList("Aaad", "Bbbc", "Cccfff", "Dddasdrg", "Eee", "F"));
        Comparator<String> comparator = Comparator.reverseOrder();
        Function<List<String>, List<String>> stringFunction = sf -> {
            List<String> result = new ArrayList<>();
            result.addAll(sf);
            Collections.sort(result, comparator);
            return result;

        };

        System.out.println(stringFunction.apply(stringList3));
        System.out.println();
        System.out.println("8.Преобразовать список строк в список их длин," +
                " используя интерфейсы Function и Supplier:");
        Supplier<List<String>> listSupplier = () -> new ArrayList<>(Arrays.asList("s", "fd", "gfguuyy", "errrry", "eeee", "ttttt"));
        Function<List<String>, List<Integer>> collSize = s -> {
            List<Integer> result = new ArrayList<>();
            for (String str : s) result.add(str.length());
            return result;
        };

        System.out.println(collSize.apply(listSupplier.get()));
        System.out.println();
        System.out.println("9.Произвести операцию над всеми элементами списка строк, " +
                "используя интерфейсы Consumer и Function:");
        Consumer<String> upCase = x -> System.out.println(x);
        Function<List<String>, String> m = a -> {
            List<String> str = new ArrayList<>();
            for (String s : a) str.add(s.toUpperCase());
            return str.toString();
        };
        System.out.println("Заглавные буквы в словах :");
        upCase.accept(m.apply(stringList2));
        System.out.println();


        System.out.println();
        System.out.println("10.Проверить, все ли элементы списка целых чисел являются " +
                "положительными, используя интерфейсы Predicate и Function:");
        Predicate<Integer> predicate = y -> y > 0;
        List<Integer> integerList3 = List.of(1, 2, 7, 5, 3, 9);
        Function<List<Integer>, Boolean> booleanFunction = l -> {
            for (Integer o : l) {
                if (!predicate.test(o)) return false;
            }
            return true;
        };
        System.out.println(integerList3);
        System.out.println("Список содержит все положитнльные числа = " + booleanFunction.apply(integerList3));

    }
}


