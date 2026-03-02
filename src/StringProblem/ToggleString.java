package StringProblem;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<91){
                ascii+=32;
                ch=(char)ascii;
                sb.setCharAt(i,ch);

            }
            else if(ascii>=92 && ascii<=122){
                ascii-=32;
                ch=(char)ascii;
                sb.setCharAt(i,ch);
            }

        }
        System.out.println(sb);
    }
}
