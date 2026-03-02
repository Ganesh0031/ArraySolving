package TwoDArraysProblem;

public class AdditionalArrays {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6}};
        int [][]b={{4,5,6},{1,2,3}};

        int m=a.length;
        int n=a[0].length;
        int [][]ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              ans[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
            }
    }
}
