package part8;

import part6.model.Order;
import part8.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Section2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -4, 2, 7, 9);

        boolean allPositive = numbers.stream()
                .allMatch(number -> number > 0);
        System.out.println("allPositive : " + allPositive);

        boolean anyNegative = numbers.stream()
                .anyMatch(number -> number < 0);
        System.out.println("anyNegative : " + anyNegative);

        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@gmail.com");

        User user2 = new User()
                .setId(102)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@gmail.com");

        User user3 = new User()
                .setId(103)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("charile@gmail.com");

        User user4 = new User()
                .setId(104)
                .setName("David")
                .setVerified(true)
                .setEmailAddress("david@gmail.com");

        List<User> users = Arrays.asList(user1, user2, user3, user4);

        boolean areAllUserVerified = users.stream()
                .allMatch(User::isVerified);
        System.out.println("areAllUserVerified : " + areAllUserVerified);

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101)
                .setCreatedAt(now.minusHours(4))
                .setAmount(BigDecimal.valueOf(2000));

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(103)
                .setCreatedAt(now.minusHours(1))
                .setAmount(BigDecimal.valueOf(4000));

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(102)
                .setCreatedAt(now.minusHours(36))
                .setAmount(BigDecimal.valueOf(3000));

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(104)
                .setCreatedAt(now.minusHours(40))
                .setAmount(BigDecimal.valueOf(7000));

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(101)
                .setCreatedAt(now.minusHours(10))
                .setAmount(BigDecimal.valueOf(1000));

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);

        boolean isAnyOrderInErrorStatus = orders.stream()
                .anyMatch(order -> order.getStatus() == Order.OrderStatus.ERROR);
        System.out.println("isAnyOrderInErrorStatus : " + isAnyOrderInErrorStatus);
    }

}
