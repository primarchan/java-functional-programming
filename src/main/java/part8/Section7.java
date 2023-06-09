package part8;

import part8.model.Order;
import part8.model.Order.OrderStatus;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Section7 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 2, 101, 203, 304, 402, 305, 34, 2312, 203);
        Map<Integer, List<Integer>> unitDigitMap = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 10));
        System.out.println("unitDigitMap : " + unitDigitMap);

        Map<Integer, Set<Integer>> unitDigitSet = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 10, Collectors.toSet()));
        System.out.println("unitDigitSet : " + unitDigitSet);

        Map<Integer, List<String>> unitDigitStrMap = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 10,
                        Collectors.mapping(number -> "unit digit is " + number, Collectors.toList())));
        System.out.println("unitDigitStrMap : " + unitDigitStrMap);

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101)
                .setAmount(BigDecimal.valueOf(2000));

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(103)
                .setAmount(BigDecimal.valueOf(4000));

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(102)
                .setAmount(BigDecimal.valueOf(3000));

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(104)
                .setAmount(BigDecimal.valueOf(7000));

        List<Order> orders = Arrays.asList(order1, order2, order3, order4);

        Map<OrderStatus, List<Order>> orderStatusListMap = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus));
        System.out.println("orderStatusListMap : " + orderStatusListMap);

        Map<OrderStatus, BigDecimal> orderStatusToSumOfAmountMap = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus,
                        Collectors.mapping(Order::getAmount,
                                Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))));
        System.out.println("orderStatusToSumOfAmountMap : " + orderStatusToSumOfAmountMap);

    }

}
