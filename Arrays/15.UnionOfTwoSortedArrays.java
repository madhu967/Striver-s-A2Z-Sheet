//Brute Force here we use TreeMap TreeMap is Map data structutre taht jeeys elemests in sorted order.

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeMap<Integer,Integer> freq=new TreeMap<>();
        for(int i=0;i<a.length;i++){
            freq.put(a[i],freq.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
            freq.put(b[i],freq.getOrDefault(b[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int key:freq.keySet()){
            list.add(key);
        }
        return list;
    }
}


//Better Approch 
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
       Set<Integer> st=new TreeSet<>();
       for(int i:a){
           st.add(i);
       }
       for(int j:b){
           st.add(j);
       }
       return new ArrayList<>(st);
    }
}


//optimal apprcoh
import java.util.*;

class Solution {
   
    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {

        List<Integer> Union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n && j < m) {
        
            if (arr1[i] < arr2[j]) {
               if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }
            
            else if (arr2[j] < arr1[i]) {
                
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++; 
            }
            else {
                
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;  
            }
        }

   
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

   
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

     
        return Union;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        Solution obj = new Solution();
        List<Integer> result = obj.findUnion(arr1, arr2, n, m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }
}
