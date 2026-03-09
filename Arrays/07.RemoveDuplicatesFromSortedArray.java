class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
      int n=arr.length;
      ArrayList<Integer> result=new ArrayList<>();
      result.add(arr[0]);
      for(int i=1;i<arr.length;i++){
          if(arr[i]>arr[i-1]){
              result.add(arr[i]);
          }
      }
     return result;
    }
    
}


//optimal
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
