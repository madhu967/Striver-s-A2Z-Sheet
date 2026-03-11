import java.util.*;
class Solution {
  public int maxSubArray(int[] nums) {

        long maxi = Long.MIN_VALUE; 

        long sum = 0; 

        int start = 0; 

        int ansStart = -1, ansEnd = -1; 

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += nums[i]; 

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        return (int) maxi;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        Solution sol = new Solution();

        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
