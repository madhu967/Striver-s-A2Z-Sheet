class Solution {
    int stockBuySell(int arr[]) {
        
        int profit = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] > arr[i]){
                profit += arr[i+1] - arr[i];
            }
        }

        return profit;
    }
}
