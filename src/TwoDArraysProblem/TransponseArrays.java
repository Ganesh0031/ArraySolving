package TwoDArraysProblem;

public class TransponseArrays {
    public static void printArray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]a={{1,2},{3,4},{5,6}};
        int m=a.length;
        int n=a[0].length;
        printArray(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;

            }
        }
        System.out.println();
        printArray(a);
    }
}
