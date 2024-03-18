public class Car {
      int noOfWheels;
      String color;
      float maxSpeed;
      float fuel;
      Float currentFuelInLiters;
      int noOFSeats;

      Car( String color){
            this.color =color; // This is how we use contructor.
            fuel=2;
      }
      Car(){
            color="black";
      }

      public Car start(){
            System.out.print("car is started,,hurrrr");
            return this;
      }
      public  void drive(){
            System.out.print("Car is driving....boooom");
            currentFuelInLiters--;
      }
      public void addFuel(float fuel){
            currentFuelInLiters+= fuel;
      }
      public void getCurrentFuelLevel(){
            System.out.print(currentFuelInLiters);

      }
      public void cooler(){
            System.out.print(color);
      }
}
