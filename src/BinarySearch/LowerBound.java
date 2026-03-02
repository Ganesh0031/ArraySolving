package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
        int lo=0,hi=arr.length-1;
        int target=25;
        int min=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target<=arr[mid]){
                min=Integer.min(min,arr[mid]);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(min);
    }
}
