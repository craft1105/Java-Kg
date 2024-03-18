import java.util.Scanner;

public class areaOfCircle {
    double radiusInMilimeter;
    areaOfCircle(double radiusInMilimeter){
        this.radiusInMilimeter = radiusInMilimeter;
    }

    double getCricumfernce(){
        return 2 * radiusInMilimeter * Math.PI;
    }
    double getArea(){
return Math.PI * Math.pow(radiusInMilimeter,2);
    }

    @Override
    public String toString() {
        return "circle props: radius in mm:"+radiusInMilimeter+" circumfernce in mm: "+getCricumfernce()+"Area in mm2:"+getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius");
        double radius =input.nextDouble();
        areaOfCircle areaOfCircle = new areaOfCircle(radius);
        System.out.println(areaOfCircle);
    }
}
