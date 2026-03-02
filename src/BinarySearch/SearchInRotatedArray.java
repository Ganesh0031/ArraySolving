package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,0,1,2};
        int lo=1, hi=arr.length-2;
        int pivote=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                pivote=mid;
                break;
            }
            else if(arr[mid]>arr[0]&& arr[mid]>arr[arr.length-1]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(pivote);


    }
}
