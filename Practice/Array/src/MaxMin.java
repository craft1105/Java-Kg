class MaxMin {
    public static void main(String[] args) {
        System.out.print("welcome to the Array sun and Average");
        int[] numArray = ArrayUtility.inputArray();
//        System.out.println(numArray.length);

        int i=0;
        int k=0;
        int o=numArray[0];;
        int j = numArray[0];
        while(i<numArray.length){
            if(j < numArray[i]){
                j = numArray[i];
            }
            i++;
        }
        while(k < numArray.length){
            if(o > numArray[k]){
                o = numArray[k];
            }
            k++;
        }

        System.out.println("This is max number : "+j);
        System.out.print("This is min number : "+o); }
}
