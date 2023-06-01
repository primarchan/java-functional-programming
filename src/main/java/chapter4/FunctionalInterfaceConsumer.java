package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceConsumer {

    public static void main(String[] args) {
        Consumer<String> myStringConsumer = str -> System.out.println(str);
        // myStringConsumer.accept("Hello");

        List<Integer> integerInputs = Arrays.asList(2, 3, 4);
        Consumer<Integer> myIntegerProcessor = x -> System.out.println("Processing integer : " + x);
        process(integerInputs, myIntegerProcessor);
        Consumer<Integer> myDifferentIntegerProcessor = x -> System.out.println("Processing integer in different way : " + x);
        process(integerInputs, myDifferentIntegerProcessor);

        List<Double> doubleInputs = Arrays.asList(2.1, 3.1, 4.1);
        Consumer<Double> myDoubleProcessor = x -> System.out.println("Processing double : " + x);
        process(doubleInputs, myDoubleProcessor);

    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }

}
