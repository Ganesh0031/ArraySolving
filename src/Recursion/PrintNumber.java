package Recursion;

public class PrintNumber {
    public static  void printNum(int a,int n){
        if(a==n){

            return ;
        }
        System.out.println(a);

        printNum(a+1,n);

    }
    public static void main(String[] args) {
        printNum(1,10);
    }
}
