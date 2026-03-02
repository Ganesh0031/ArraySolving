package StringProblem;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The reverse String");
        StringBuilder sb=new StringBuilder(sc.next());
        int i=0;int j=sb.length()-1;
        System.out.println(sb);
        while(i<j){
            char ch=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
        System.out.println(sb);

    }
}
