package StringProblem;

import java.util.Arrays;

public class CheckIsomarphic {
    public static void main(String[] args) {
        String s="title";
        String t="abper";
        char[]freq=new char[26];
        Arrays.fill(freq,'0');
        if(s.length()!=t.length()){
            System.out.println("This is not isomarphic");
//            System.exit(0);
        }
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            int sVal = sChar-'a';
            if(freq[sVal]!='0'){
                if(freq[sVal]!=tChar){
                    System.out.println("This is not isomorphic");
                }
            }
            freq[sVal]=tChar;
        }

    }
}
