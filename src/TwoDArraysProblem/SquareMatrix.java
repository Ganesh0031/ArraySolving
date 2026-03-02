package TwoDArraysProblem;

public class SquareMatrix {
    public static void printArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("This is the original matrix");
        printArray(arr);
        System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("After the swap");
        printArray(arr);
        for(int i=0;i<m;i++){
            int a=0; int b=m-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        System.out.println("After ther rotated");
        printArray(arr);
    }
}
