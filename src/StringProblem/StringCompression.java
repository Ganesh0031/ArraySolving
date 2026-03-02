package StringProblem;

public class StringCompression {
    public static void main(String[] args) {
     String s="aaabbcdddff";
     String ans="";
     int i=0;
     while(i<s.length()) {
        int j=i;
        while(j<s.length() &&s.charAt(i)==s.charAt(j))j++;
        ans+=s.charAt(i);
        int len=j-i;
        if(len>1)ans+=len;
        i=j;
     }
     System.out.println(ans);

    }
}
