import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class FunctionalInterfaceBiConsumer {

    public static void main(String[] args) {
        BiConsumer<Integer, Double> myDoubleProcessor =
                (Integer index, Double input) -> System.out.println("Processing" + input + " at index " + index);

        List<Double> inputs = Arrays.asList(2.1, 3.1, 4.1);
        process(inputs, myDoubleProcessor);
    }

    public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
        for (int i = 0; i < inputs.size(); i++) {
            processor.accept(i, inputs.get(i));
        }

    }

}
