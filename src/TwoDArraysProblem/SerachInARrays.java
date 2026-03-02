package TwoDArraysProblem;

public class SerachInARrays {
    public static  void printArr(int [][]arr){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,14,23,26,26}};
        int m=arr.length;
        int n=arr[0].length;
        printArr(arr);
        System.out.println();
        int target=14;
        int i=n-1; int j=0;
        while(i>=0 && j<n){
            if(arr[i][j]==target) {System.out.println(arr[i][j]+" "+i+" "+ j);break;}
           else if(arr[i][j]<target){
                j++;
            }
           else if(arr[i][j]>target){
               i--;
            }
        }
    }
}
