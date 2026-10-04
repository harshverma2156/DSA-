package Search.Array;

public class FindLargestNumber {
    public static void main(String[] args){
        int[] numbers = {12,33,43,56,78,987,23,44};
        int largest = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(largest==numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.println(largest);
    }
}
