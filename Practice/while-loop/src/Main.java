import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First number : ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the Second number : ");
        int num2 = input.nextInt();
psum
        int i=1;
        while(true){
            int factor = num1 * i;
            if(factor % num2==0){
            return factor;            }

        }
        i++;
    }
}