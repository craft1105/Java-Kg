import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the first number ");
        int num1 = input.nextInt();
        System.out.print("please enter the second number ");
        int num2 = input.nextInt();
       int total =num1*num2;
        long i =1;
        while(i<total){
            i++;
            long total1= num1%i;
            long total2= num2%i;
            if(total1==0 && total2==0){
                System.out.println(i);
            }

        }
    } 
}