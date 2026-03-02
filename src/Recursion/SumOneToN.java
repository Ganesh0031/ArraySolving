package Recursion;

public class SumOneToN {
    public static  int sum(int n, int sum){
        if(n==0){

            return sum;
        }
        return  sum(n-1,sum+n);

    }
    public static void main(String[] args) {
        System.out.println(sum(5,0));
    }
}
