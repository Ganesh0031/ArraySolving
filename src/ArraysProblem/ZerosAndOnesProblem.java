package ArraysProblem;

public class ZerosAndOnesProblem {
    public static void main(String[] args) {
        int []arr={1,1,0,1,0,1,2,2,0,1,1,0,1,2,1,0};
        int n=arr.length;
        int lo=0;int mid=0;int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                mid++;lo++;
            }

            else if(arr[mid]==1)    {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
