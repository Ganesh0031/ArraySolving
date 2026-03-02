package ArrayModule;

public class RemoveDublicateHs {
    public static void main(String[] args) {
        int []arr={1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n=arr.length;
        int []ans=new int[n];
        ans[0]=arr[0];
        int i=0,j=0;
        int k=0;
        while(i<n-1){
             if(arr[i]!=arr[j]){
                 ans[k++]=arr[j];
                 i=j+1;
                 j=i;
             }
             else{
                j++;
             }
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
