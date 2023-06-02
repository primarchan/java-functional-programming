package part5.chapter4;

import java.util.function.Supplier;

public class FunctionalInterfaceSupplier {

    public static void main(String[] args) {
        Supplier<String> myStringSupplier = () -> "Hello world!";
        // System.out.println("myStringSupplier : " + myStringSupplier.get());

        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        // System.out.println("myRandomDoubleSupplier : " + myRandomDoubleSupplier.get());
        // System.out.println("myRandomDoubleSupplier : " + myRandomDoubleSupplier.get());
        // System.out.println("myRandomDoubleSupplier : " + myRandomDoubleSupplier.get());
        printRandomDoubles(myRandomDoubleSupplier, 5);
    }

    public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }

}
