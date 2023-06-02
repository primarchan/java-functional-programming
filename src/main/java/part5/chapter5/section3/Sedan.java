package part5.chapter5.section3;

public class Sedan extends Car {

    public Sedan(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving a sedan " + name + " from " + brand);
    }

}
