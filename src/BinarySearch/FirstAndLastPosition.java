package BinarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []arr={1,2,10,20,20,20,30,30,30,40};
        int target=20;
        int fps=Integer.MAX_VALUE;
        int lps=Integer.MAX_VALUE;
        boolean flage=false;
        int lo=0;int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                flage=true;
                break;
            }
            else if(target<arr[mid]) hi=mid-1;
            else lo=mid+1;
        }
        if(flage==true){
            System.out.println("The element not present in this code");
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target<=arr[mid]){
                fps=Math.min(fps,mid);
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }

        System.out.println(fps);
        lo=0;hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(target<arr[mid]){
                lps=Math.min(lps,mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(lps);
    }
}
