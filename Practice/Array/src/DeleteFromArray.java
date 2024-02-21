import java.util.Scanner;
import java.util.Arrays;

class DeleteFromArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number you want to delete : ");
        int num = input.nextInt();
        int[] result = deletion(numArray,num);
        System.out.print( Arrays.toString(result));
    }

    public static int[] deletion(int [] numArray , int num) {
        int occ = numArray.length-OccurrencesArray.total(numArray,num);

        int [] newarr = new int[occ];
        int i =0;
        int j=0;
        while(i < numArray.length){
            if(numArray[i] != num) {
                newarr[j] = numArray[i];
                j++;
            }
            i++;
        }
       return newarr;
    }
}
