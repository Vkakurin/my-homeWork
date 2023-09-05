package students.Vkakurin.lesson_18_HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HW_18_02 {
  //  Используя Java Stream API, отсортируйте список объектов по одному из их полей в обратном порядке.
  public static void main(String[] args) {
      List<Price> priceList = new ArrayList<>();
      priceList.add(new Price("goods1",20.0));
      priceList.add(new Price("goods2",15.0));
      priceList.add(new Price("goods3",18.0));
      priceList.add(new Price("goods4",10.0));
      priceList.add(new Price("goods5",12.0));
      priceList.add(new Price("goods6",9.0));
      priceList.stream()
              .sorted(Comparator.comparing(Price::getName).reversed())
              .forEach(e-> System.out.println(e.getName() + " = " + e.getCost()));


  }

 static class Price {
   private String name;
   private Double cost;

     public Price(String name, Double cost) {
         this.name = name;
         this.cost = cost;
     }

     public String getName() {
         return name;
     }

     public Double getCost() {
         return cost;
     }

     @Override
     public String toString() {
         return "Price{" +
                 "name='" + name + '\'' +
                 ", cost=" + cost +
                 '}';
     }
 }


}
