import java.sql.SQLOutput;
import java.util.Scanner;

class search2DArray {
    public static void main(String[] args) {
        System.out.print("Welcome to 2D search");
        Scanner input = new Scanner(System.in);
         int [][] numArr = ArrayUtility.input2DArray();
        System.out.print("Please Enter the number you want to search : ");
        int find = input.nextInt();
        boolean isfound=search(numArr,find);
        if(isfound){
            System.out.print("Your number is found");
        }else{
            System.out.print("your number is not found");
        }
    }

    public static boolean search(int [][] numArr, int find) {
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr[i].length){
                if(numArr[i][j]==find){
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
