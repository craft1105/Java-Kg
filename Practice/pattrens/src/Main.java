import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome To Apna code");
        System.out.print("Please enter the number : ");
        int num = input.nextInt();

        switch(num){
            case 1:
                System.out.print("you are accpted");
                break;
            case 2:
                System.out.print("You are also accepted");
                break;
            case 3:
                System.out.print("cancelled");
            default:
                System.out.print("hello world");

    }
}
}