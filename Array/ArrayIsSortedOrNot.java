package Search.Array;

public class ArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        // Traverse array
        for (int i = 0; i < arr.length - 1; i++) {

            // Compare adjacent elements
            if (arr[i] > arr[i + 1]) {

                isSorted = false;
                break;
            }
        }

        // Print result
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}