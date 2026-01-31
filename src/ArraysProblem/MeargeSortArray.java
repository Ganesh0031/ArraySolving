package ArraysProblem;

public class MeargeSortArray {
    public static void main(String[] args) {
        int []a={1,3,4,10};
        int []b={2,5,6,7,8,9};
        int m=a.length;
        int n=b.length;
        int []ans=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                ans[k++]=a[i++];
            }
            else{
                ans[k++]=b[j++];
            }
        }
        if(i==m){
            while(j<n){
                ans[k++]=b[j++];
            }
        }
        if(j==n){
            while(i<m){
                ans[k++]=a[i++];
            }
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
