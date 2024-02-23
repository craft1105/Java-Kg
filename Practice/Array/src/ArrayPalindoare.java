class ArrayPalindoare {
    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputArray();
        boolean result =Palindoare(arr) ;
        if(result){
            System.out.print("Array is palendrom");
        }else{
            System.out.print("Array is not palendrom");
        }

    }

    public static boolean Palindoare(int [] arr) {
         int i=0;
         while(i<arr.length/2){
             if(arr[i] != arr[ arr.length-1-i]){
                 return false;
             }
        i++;
         }
        return true;
    }

}
