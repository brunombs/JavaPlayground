public class Refrigerator extends Appliance{
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator (" + getBrand() + ") is now on.");
    }
}
