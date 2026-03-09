//Given a sorted array arr[] and an integer k, find the position(0-based indexing) at 
//which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 

Note: If multiple occurrences are there, please return the smallest index.

class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                ans=mid;
                end=mid-1;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
