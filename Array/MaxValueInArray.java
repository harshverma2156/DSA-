package Search.Array;

public class MaxValueInArray {
    private static void main(String[] args) {
        int[] arr = {4,6,2,9,-112};
        int i;
        int max = arr[0];

        for(i=0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
