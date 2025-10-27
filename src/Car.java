public class Car extends Vehicle {

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Car VROOM!");
    }
}
