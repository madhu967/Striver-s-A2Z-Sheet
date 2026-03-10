// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int xorr=0;
        for(int i=0;i<arr.length;i++){
            xorr^=arr[i];
        }
        return xorr;
    }
}
