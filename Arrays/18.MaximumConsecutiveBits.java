class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count=1;
        int maxCount=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                maxCount=Math.max(count,maxCount);
                count=1;
            }
            
        }
        return maxCount=Math.max(count,maxCount);
    }
}
