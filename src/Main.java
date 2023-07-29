public class Main {
    public static void main(String[] args) {
        Car tesla = new Car();

        tesla.setColor("Black");
        tesla.setMake("Tesla");
        tesla.setModel("Model X");
        tesla.setDoors(2);
        tesla.setConvertible(true);

        tesla.describeCar();

        Car dodge = new Car();

        dodge.setMake("Dodge");

        dodge.describeCar();
    }
}
