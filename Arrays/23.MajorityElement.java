//better approch
class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)>arr.length/2){
                return a;
            }
        }
        return -1;
    }
}

//optimal approch
class Solution {
    int majorityElement(int nums[]) {
        // code here
         int candidate = 0;
        int count = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            } 
            else{
                count--;
            }
        }
        
        int count1=0;
        for(int num:nums){
            if(num==candidate){
                count1++;
            }
        }
        if(count1>nums.length/2){
            return candidate;
        }
        return -1;
    }
}
