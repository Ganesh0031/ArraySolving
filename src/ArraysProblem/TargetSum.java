package ArraysProblem;

public class TargetSum {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,21,22,89};
        int n=arr.length;
        int target=11;
        for(int i=0;i<n-1;i++ ){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
            }

        }
    }
}
