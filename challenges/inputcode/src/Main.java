import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter your name :");
        String name = input.nextLine();
        System.out.println("Wellcome "+name+" to Kg Coding");
        System.out.print("Enter First the number you want to add :");
        int Fnum = input.nextInt();
        System.out.print("Enter the Second number :");
        int Snum = input.nextInt();
        System.out.println("Addition of you number is "+(Fnum+Snum));
    }
}