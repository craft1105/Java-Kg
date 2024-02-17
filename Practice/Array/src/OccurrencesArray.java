import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Welcome to OccurrencesArray");
        int [] array = ArrayUtility.inputArray();
        System.out.print("Please Enter the number you want to find :");
        int find = input.nextInt();
        int occrences = total(array,find);
        System.out.print("Yes number is match "+occrences +" times in array");

    }

    public static int total(int[] array ,int find) {
         int i=0;
         int u=0;
         while(i<array.length){
             if(find ==array[i]){
                 u++;
             }
             i++;
         }

         return u;
    }


}
