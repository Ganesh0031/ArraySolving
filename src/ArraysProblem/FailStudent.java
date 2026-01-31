package ArraysProblem;

public class FailStudent {


    public static void main(String[] args) {
        int []arr={18,36,35,21,78,78,76};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.println(i+" ");
            }
        }
    }
}
