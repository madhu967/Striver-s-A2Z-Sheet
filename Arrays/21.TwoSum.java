//brute forcd ruuning 2 loops an checign evey possibilty

//better 
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int compliment=target-arr[i];
            if(map.containsKey(compliment)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
}


//optimal 

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return true;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
