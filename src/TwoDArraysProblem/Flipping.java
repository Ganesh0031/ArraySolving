package TwoDArraysProblem;

public class Flipping {
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
        int [][]arr={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("This is the original array");
        printArr(arr);
        System.out.println();
        for(int i=0;i<m;i++){
            if(arr[i][0]==0) {
                for (int j = 0; j < n; j++) {
                      if(arr[i][j]==0)arr[i][j]=1;
                      else arr[i][j]=0;
                }
            }

        }
        System.out.println("This is the made first number 1 ");
        printArr(arr);
        System.out.println();
        for(int j=1;j<n;j++){
           int noOfZeros=0;
           int noOfOnes=0;
           for(int i=0;i<m;i++){
               if(arr[i][j]==0)noOfZeros++;
               else noOfOnes++;
           }
           if(noOfZeros>noOfOnes){
               for(int i=0;i<m;i++){
                   if(arr[i][j]==0)arr[i][j]=1;
                   else arr[i][j]=0;
               }
           }

        }
        System.out.println("This is the after flipping");
        printArr(arr);
    }
}
