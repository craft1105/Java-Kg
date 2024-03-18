public class Car {
    int noOFWheels;

    int numberOfDoor;

    int maxSpeed;

    String name; 

    @Override
    public String toString() {
        return "Car{" +
                "noOFWheels=" + noOFWheels +
                ", numberOfDoor=" + numberOfDoor +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }
//    public Car(int noOFWheels, int numberOfDoor, String name) {
//        this.noOFWheels = noOFWheels;
//        this.numberOfDoor = numberOfDoor;
//        this.name = name;
//  }

    public static void main(String[] args) {
        Car swift = new Car();
        System.out.println(swift.toString());
    }
}
