//Better Approch having time complexity of O(n)
class Solution {
    public int secondLargestElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>smax && nums[i]!=max){
                smax=nums[i];
            }
        }
        if(smax == Integer.MIN_VALUE){
            return -1;
        }
        return smax;
    }
}


//optimal approch 
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_largest=max;
                max=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=max){
                second_largest=arr[i];
            }
        }
        
        if(second_largest==Integer.MIN_VALUE) second_largest=-1;
        return second_largest;
    }
}

//t.c -O(N) but in one loop 
