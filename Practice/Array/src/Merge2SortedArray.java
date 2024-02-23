import java.util.Arrays;
class Merge2SortedArray {
    public static void main(String[] args) {
        int [] arr1 = ArrayUtility.inputArray();
        int [] arr2 = ArrayUtility.inputArray();
        int[] mege = merge(arr1,arr2);
        System.out.println(Arrays.toString(mege));

    }
    public static int [] merge(int[] arr1 ,int[] arr2 ){
        int i =0,j=0,k=0;
        int newsize = arr1.length+ arr2.length;
        int [] newarr = new int [newsize];
        while(i<newsize){
            if(arr1[i] < arr2[j]){
                newarr[k] = arr1[j];
                i++;
                k++;
            }else{
                newarr[k] = arr2[i];
                j++;
                k++;
            }

        }
return newarr;
    }

}
//Not Understand