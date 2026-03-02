package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={1,33,22,21,3,5,0};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
