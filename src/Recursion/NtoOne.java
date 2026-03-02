package Recursion;

public class NtoOne {
    public static  void printReverseNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printReverseNumber(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        printReverseNumber(n);
    }
}
