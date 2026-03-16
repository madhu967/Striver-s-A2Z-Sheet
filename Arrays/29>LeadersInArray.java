class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
                
            }
            if(leader){
                    ans.add(arr[i]);
                }
            
        }
        return ans;
    }
}


//optimla solution 

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        int max=arr[arr.length-1];
        ans.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}

