package Search.Array;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] arr = {4, 8, 1, 10, 3};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Update largest and second largest
            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            }
            // Update only second largest
            else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        // Check if second largest exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}