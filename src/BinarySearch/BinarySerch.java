package BinarySearch;

public class BinarySerch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int lo=0,hi=arr.length-1;
        int target=2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
                System.out.println("found the element at idx " + mid);
                break;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }


    }
}
