import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int num = input.nextInt();
    int i =1;
    while(i<num){
        if(num % i == 0){
            System.out.print("your number is not prime");
        }
        i++;
    }
        System.out.print("your number is prime");
    }
}