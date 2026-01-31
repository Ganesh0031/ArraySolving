package ArraysProblem;

public class KRotatedArray {
    public static void rotated (int []arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60};
        int n=arr.length;
        int k=3;
        k%=n;
        rotated(arr,0,n-k-1);
        rotated(arr,n-k,n-1);
        rotated(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
