package StringProblem;

import java.util.Scanner;

public class MaximumFrequecy {
    public static void main(String[] args) {
        System.out.println("Enter the String check for the frequecy");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] frq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-97;
            frq[idx]++;
        }
        int maxFreq=Integer.MIN_VALUE;
        for(int i=0;i<frq.length;i++){
            maxFreq=Math.max(maxFreq,frq[i]);
        }
        for(int i=0;i<frq.length;i++){
            if(maxFreq==frq[i]){
                char ch=(char)(i+97);
                System.out.println("This is the maximum charachter occurance :"+ ch);
            }
        }
    }
}
