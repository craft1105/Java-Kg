import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println("Good morning "+ name);
    }
}