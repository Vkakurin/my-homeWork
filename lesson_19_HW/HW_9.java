package students.Vkakurin.lesson_19_HW;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HW_9 {
    //9) Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
    //        Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1,1,10,true));
        orderList.add(new Order(2,1,15,false));
        orderList.add(new Order(3,1,11,true));
        orderList.add(new Order(4,2,12,false));
        orderList.add(new Order(5,3,10,true));
        orderList.add(new Order(6,3,10,false));
        orderList.add(new Order(7,3,1,true));
        orderList.add(new Order(8,4,9,false));
        orderList.add(new Order(9,4,2,false));
        orderList.add(new Order(10,4,5,true));
        orderList.add(new Order(10,5,6,false));
        //orderList.stream().collect(Collectors.groupingBy(t -> Order.getMonth(t),Collectors.summingInt(Order::getSumma)));









    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    static class Order{
        private Integer order_id;
        private Integer month;
        private Integer summa;
        private Boolean is_completed;
    }
}
