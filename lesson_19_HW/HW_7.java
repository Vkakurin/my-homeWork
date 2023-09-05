package students.Vkakurin.lesson_19_HW;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class HW_7 {

    //7) Дана коллекция Product - название, категория, цена, количество на складе.
    //        Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение(150)
    //        и отсортировать по убыванию цены
    public static void main(String[] args) {
        List<Product>  productList = new ArrayList<>();
        productList.add(new Product("goods1",1.5,1,185));
        productList.add(new Product("goods2",3.5,2,110));
        productList.add(new Product("goods3",2.5,1,150));
        productList.add(new Product("goods4",2.5,1,170));
        productList.add(new Product("goods5",5.5,2,190));
        productList.add(new Product("goods6",9.5,1,200));
        productList.add(new Product("goods7",6.0,2,220));


        var value = productList.stream().
                filter(product -> product.getQuantity() >= 150).
                collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice))).
                entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();




        for(Map.Entry<Integer, Double> p: value) {
            System.out.println(p.getValue());
        }


    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    static class Product{
       private String name;
       private Double price;
       private Integer category;
       private Integer quantity;

    }
}
