import java.util.Arrays;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int [] array = ArrayUtility.inputArray();
         int i = 0;
         int count = array.length-1;
         int [] newarr = new int [array.length];
         while(i < array.length){
             System.out.print(count);
             newarr[i] = array[count];
             count--;
             System.out.print(count);
             i++;
         }
        System.out.print( Arrays.toString(newarr));
    }
}
