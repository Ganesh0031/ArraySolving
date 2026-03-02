package ArrayModule;

import java.util.Arrays;

public class SecondHighestElement {
    public static void main(String[] args) {
        int []arr={20,35,46,34,2,1};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Highest Element in java "+max);
        int sHigh=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sHigh && max>arr[i]){
                sHigh=arr[i];
            }
        }
        System.out.println("The Second Highest Element in java "+sHigh);
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
