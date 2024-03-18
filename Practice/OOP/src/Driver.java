public class Driver {
    static String name;
    String Dateoflicense;

    public static void main(String[] args) {
        Car mycar = new Car("black");

        mycar.start().drive();
        Driver myydriver = new Driver();

        myydriver.Dateoflicense="345345";
        mycar.cooler();
    }


    
}
