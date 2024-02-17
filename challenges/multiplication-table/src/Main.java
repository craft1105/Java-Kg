import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print the table :");
        int number = input.nextInt();


            while(i<10){
                i++;
                int num= number*i;
                System.out.println(number+"x"+i+"="+num);
            }

    }
}