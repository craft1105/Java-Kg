import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Element number :");
        int size = input.nextInt();
        int [] nums =new int [size];

        int i =0;
        while(i<size){
            System.out.print("Please Enter the number of element "+(i+1)+" :");
            nums[i]= input.nextInt();
            i++;
        }
        return  nums;
    }


public static int[][] input2DArray() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter the Element number column: ");
    int row = input.nextInt();
    System.out.print("Please Enter the Element number row: ");
    int column = input.nextInt();
    int[][] numArray = new int[row][column];
    int i = 0;
    while (i < row) {
        int j = 0;
        while (j < column) {
            System.out.print("Please Enter the row  " + (i + 1) + " column"+ (j + 1) +" :");
            numArray[i][j] = input.nextInt();
           j++;
        }
        i++;
    }
    return numArray;
}
}