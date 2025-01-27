package Search;

public class LinearSearch {
    public static void main(String[] args){
        int nums[] = {1,2,3,6,5,4,9,8};
        int target = 6;
        int result = linearSearch(nums ,target);


        if(result != -1)
            System.out.println("The element is found at: "+ result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int nums[], int target){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target)
                return i;
        }

        return -1;

    }
}
