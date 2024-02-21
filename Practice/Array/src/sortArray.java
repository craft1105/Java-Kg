public class sortArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        boolean isdec = Isdecreasing(numArray);
        boolean isinc = isincreasing(numArray);
        if(isdec || isinc){
            System.out.print("your array is sort");
        }else{
            System.out.print("your array is not sort");
        }


}

    public static boolean Isdecreasing(int[] numArray) {

         int i =1;
         while(i< numArray.length){
             if(numArray[i-1] < numArray[i]){
                 return false;
             }
             i++;
         }
        return true;
    }
    public static boolean isincreasing(int[] numArray) {
        int i =1;
        while(i < numArray.length){
            if(numArray[i-1] > numArray[i]){
                return false;
            }
            i++;
        }
        return true;
    }

}
