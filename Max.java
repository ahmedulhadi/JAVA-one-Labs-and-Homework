public class Max {
    public static void main(String[] args) {
        int[] numbers = { 72, 5, 4537, 7, 21, 30 };
        int max = findLargest(numbers);
        System.out.println(max);
        
    }
    public static int findLargest(int[] nums) {
        int largestSoFar = Integer.MIN_VALUE;
        int i= 0; 
        while (1 <= nums.length - 1) {
            if (largestSoFar < nums[i]) {
                largestSoFar = nums [i];
            }
            i++;
        }
        return largestSoFar;
    }
}