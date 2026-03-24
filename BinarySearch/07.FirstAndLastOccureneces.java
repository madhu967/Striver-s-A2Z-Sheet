import java.util.*;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int firstIndex = first(arr, x);
        int lastIndex = last(arr, x);
        
        result.add(firstIndex);
        result.add(lastIndex);
        
        return result;
    }

    public int first(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1; // move left
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }

    public int last(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1; // move right
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
    }
}
