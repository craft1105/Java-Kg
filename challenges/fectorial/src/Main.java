import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the number for fectorial :");
        int number = input.nextInt();
        int i=0;
        long total=1;
        while(i<number){
            total=total*++i;
        }
        System.out.println(total);
    }
}