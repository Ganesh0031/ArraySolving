package ArraysProblem;

public class NextGreterElement {
    public static void main(String[] args) {
        int []arr={12,8,60,37,2,49,16,28,21};
        int n=arr.length;
        arr[n-1]=-1;
        int highValue=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>highValue){
                 highValue=arr[i];
                arr[i]=-1;
            }
            else{
                arr[i]=highValue;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
