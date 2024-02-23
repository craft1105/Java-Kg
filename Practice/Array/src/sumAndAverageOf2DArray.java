public class sumAndAverageOf2DArray {
    public static void main(String[] args) {
        int [][]Arr = ArrayUtility.input2DArray();
        int  total=sum(Arr);
        int Ave =Ave(Arr);
        System.out.println("the sum of given array is "+total);
        System.out.print("the Average of given array is "+Ave);
    }
    public static int sum(int [][]Arr){
        int cal =0;
        int i =0;
        while(i<Arr.length){
            int j= 0;
            while(j<Arr[i].length){
                cal += Arr[i][j];
                j++;
            }
            i++;
        }
        return cal;
    }

    public static int Ave(int [][]Arr) {
        int cal =0;
        int i =0;
        while(i<Arr.length){
            int j= 0;
            while(j<Arr[i].length){
                cal += Arr[i][j];
                j++;
            }
            i++;
        }
        return cal/Arr[0].length;
    }

    }

