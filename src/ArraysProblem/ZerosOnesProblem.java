package ArraysProblem;

public class ZerosOnesProblem {
    public static void main(String[] args) {
         int []arr={1,1,0,0,1,0,1,0,0,0};
         int n=arr.length;
         int countZeros=0;
         for(int i=0;i<n;i++){
             if(arr[i]==0){
                 countZeros++;
             }
         }
         for(int i=0;i<countZeros;i++){
             arr[i]=0;
         }
         for(int i=n-countZeros;i<n;i++){
             arr[i]=1;
         }
         for(int ele:arr){
             System.out.print(ele+" ");
         }
    }
}
