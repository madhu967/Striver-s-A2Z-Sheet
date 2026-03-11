//brute 
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
}


//optimal 
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
       int sum=0;
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           if(sum>maxi){
               maxi=sum;
           }
           if(sum<0){
               sum=0;
           }
       }
       return maxi;
    }
}
