package Search.Array;
import java.util.Arrays;

public class SecondLargeNumber {

    public static void main(String[] args) {
        int[] arr = {03,16,26,3,43,5,64,7,55,55};

        Arrays.sort(arr);

       int x= arr.length;

       int y = x-2;

        System.out.println("The second Largest number is " + arr[y]);
        System.out.println("2nd largest number is at : " + y);

    }

}
