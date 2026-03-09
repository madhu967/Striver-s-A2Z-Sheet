//better apprcoh
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}

//optimla approch
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }
}
