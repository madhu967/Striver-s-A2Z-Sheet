//better 
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int smallest=Integer.MIN_VALUE;
        int count=0;
        int longest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1 == smallest){
                count+=1;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest){
                count=1;
                smallest=arr[i];
            }
            longest=Math.max(longest,count);
        }
        
        return longest;
        
    }
}

//optimal approch
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> st=new HashSet<>();
        int count=0;
        int longest=0;
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                count=1;
                int x =it;
                while(st.contains(x+1)){
                   
                    x=x+1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
