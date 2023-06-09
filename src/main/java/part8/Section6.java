package part8;

import part8.model.Order;
import part8.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section6 {

    public static void main(String[] args) {
        Map<Integer, String> numberMap = Stream.of(3, 5, -4, 2, 6)
                .collect(Collectors.toMap(Function.identity(), x -> "Number is " + x));
        System.out.println("numberMap : " + numberMap);
        System.out.println(numberMap.get(3));

        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@gmail.com")
                .setFriendUserIds(Arrays.asList(201, 202, 203, 204));

        User user2 = new User()
                .setId(102)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@gmail.com")
                .setFriendUserIds(Arrays.asList(204, 205, 206));

        User user3 = new User()
                .setId(103)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("charile@gmail.com")
                .setFriendUserIds(Arrays.asList(204, 205, 207));

        List<User> users = Arrays.asList(user1, user2, user3);

        Map<Integer, User> userIdToUserMap = users.stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));
        System.out.println("userIdToUserMap : " + userIdToUserMap);
        System.out.println(userIdToUserMap.get(103));

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

        Map<Long, Order.OrderStatus> orderIdToOrderStatusMap = orders.stream()
                .collect(Collectors.toMap(Order::getId, Order::getStatus));
        System.out.println("orderIdToOrderStatusMap : " + orderIdToOrderStatusMap);
        System.out.println(orderIdToOrderStatusMap.get(1003L));

    }

}
