package Search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int result = binarySearch(nums, target);
        if(result != -1){
            System.out.println("The Element Found at: " + result);
        }else {
            System.out.println("Not Found");
        }

    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target){
                left = mid + 1;
            } else{
                right= mid -1;
            }
        }
        return -1;
    }
}
