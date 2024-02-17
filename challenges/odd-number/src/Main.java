import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the end number :");
        int number = input.nextInt();
        int i=0;
        int total=0;

        while(i<number){
            i++;
            if(i%2!=0){
                total += i;
            }
        }
        System.out.println(total);


    }
}