package Search.Array;

public class TraversingArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 9;

        //Traversing the array
        for (int j = 0; j < arr.length; j++) {
            System.out.println("The element at: " + j);
        }



        //Finding the target element.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " is at : " + i);
                break;
            }
        }
    }
}
