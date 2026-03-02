package Sorting;

public class SelectionSort {
    public static  void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={1,33,22,21,3,5,0};

        for(int i=0;i<arr.length;i++){
            int idx=-1;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            swap(arr,idx,i);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
