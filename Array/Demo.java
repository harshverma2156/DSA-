package Search.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //we need an Array,
        // one loop for array traversal,
        // two variables to store largest and second-largest number,
        //condition.

        int[] arr = {66,99,34,45,999,122,32,44,68,72};
        int largest, secondLargest;
        largest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest) {
                secondLargest = largest ;
                largest = arr[i];
            }
        }
        System.out.println("The Largest Number is: " +largest + "/nThe Second Largest Number is: "+ secondLargest);
    }
}
