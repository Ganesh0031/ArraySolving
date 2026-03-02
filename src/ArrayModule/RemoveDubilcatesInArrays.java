package ArrayModule;

import java.util.HashSet;

public class RemoveDubilcatesInArrays {
    public static void main(String[] args) {
        int []arr={1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n=arr.length;
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<n;i++){
            ans.add(arr[i]);
        }
        System.out.println(ans);
    }
}
