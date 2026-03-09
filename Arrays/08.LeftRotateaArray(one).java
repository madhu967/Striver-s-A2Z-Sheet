
//Better Approch
class Solution {

    public static void solve(int[] arr, int n) {
        int[] temp = new int[n]; 

  
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];  

        for(int i=0;i<n;i++){
          nums[i]=temp[i];
    }
}

//Optimal Approch
class Solution {
    public void rotateArrayByOne(int[] nums) {
       
        int temp = nums[0];
        
     
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;
    }
}
