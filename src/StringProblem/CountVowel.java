package StringProblem;

import java.util.Scanner;

public class CountVowel {
    public static  boolean isVowel(char ch){
        if(ch=='a'|| ch=='A')return true;
        if(ch=='e'|| ch=='E')return true;
        if(ch=='i'|| ch=='I')return true;
        if(ch=='o'|| ch=='O')return true;
        if(ch=='u'|| ch=='U')return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Vowel");
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        System.out.println("The count of vowel is"+count);
    }
}
