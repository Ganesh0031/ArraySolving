package ArrayModule;

public class MargeAllOnesEnd {
    public static void main(String[] args) {
        int []arr={1,0,1,2,1,3,4};
        int n=arr.length;
        int i=0;int j=n-1;
        while(i<j) {
            if (arr[i] != 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
     for(int ele:arr){
         System.out.print(ele+" ");
     }
    }
}
