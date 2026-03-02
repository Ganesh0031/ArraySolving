package TwoDArraysProblem;

import java.util.Scanner;

public class StoreMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr={{1,5,6},{3,4,5},{8,9,10}};
        int m=arr.length;
        int n=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                 max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
