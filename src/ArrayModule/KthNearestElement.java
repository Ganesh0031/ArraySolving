package ArrayModule;

public class KthNearestElement {
    public static void main(String[] args) {
        int []arr={12,-90,31,255,-8,-1};
        int k=25;
        int diff=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            int currDiff=Integer.MAX_VALUE;
            if(arr[i]>k){
                 currDiff=arr[i]-k;
                if(currDiff<diff){
                    diff=currDiff;
                    idx=i;
                }
            }
            else {
                 currDiff = k - arr[i];
                if (currDiff < diff) {
                    diff=currDiff;
                    idx = i;
                }
            }
        }
        System.out.println("The K nearest value : "+arr[idx]);
    }
}
