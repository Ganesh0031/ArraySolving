package Sorting;

import static Sorting.SelectionSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={1,33,22,21,3,5,0};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
