package part5.chapter5.section3;

public class Van extends Car {

    public Van(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving a van " + name + " from " + brand);
    }

}
