class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        List<Integer> ans = new ArrayList<>();
         int [] freq = new int[arr.length + 1];
         for (int num : arr){
             freq[num]++;
         }
        for (int i = 1; i<=arr.length; i++){
            ans.add(freq[i]);
        }
         return ans;
    }
}
