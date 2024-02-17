import java.util.Scanner;

class AverageOfArray {
    public static void main(String [] arr){
        System.out.print("welcome to the Array sun and Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int Avg = Average(numArray);
        System.out.println("Your Sum of array is "+sum);
        System.out.print("Your Sum of array is "+Avg);
    }
    public static long sum(int[] numArray){
        long arr = 0;
        int i =0;
        while (i<numArray.length){
            arr += numArray[i];
            i++;
        }
        return arr;
    }

    public static int Average(int[] numArray){
        long sum = sum(numArray);
        return (int)(sum/ numArray.length);

    }
}
