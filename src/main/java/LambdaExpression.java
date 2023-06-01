import util.Adder;
import util.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args) {

        // Function Interface
        Function<Integer, Integer> myAdder01 = new Adder();
        int result01 = myAdder01.apply(5);
        System.out.println("result01 : " + result01);

        // Lambda Expression 1
        Function<Integer, Integer> myAdder02 = (Integer x) -> {
            return x + 10;
        };
        int result02 = myAdder02.apply(5);
        System.out.println("result02 : " + result02);

        // Lambda Expression 2
        Function<Integer, Integer> myAdder03 = x -> x + 10;
        int result03 = myAdder03.apply(5);
        System.out.println("result03 : " + result03);

        // BiFunction Interface
        BiFunction<Integer, Integer, Integer> myAdder04 = (x, y) -> x + y;
        int result04 = myAdder04.apply(3, 5);
        System.out.println("result04 : " + result04);

        // Functional Interface (사용자 정의 Function Interface)
        TriFunction<Integer, Integer, Integer, Integer> myAdder05 = (x, y, z) -> x + y + z;
        int result05 = myAdder05.apply(3, 2, 5);
        System.out.println("result05 : " + result05);
    }

}
