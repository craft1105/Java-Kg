import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
int step1 =0;
        while(number>0){
            step1 +=number % 10;
            number/=10;
            System.out.println(step1);
        }
    }
}