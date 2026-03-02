package StringProblem;

public class UpdatAllEvenNumberChar {
    public static void main(String[] args) {
        String s="Ganesh";
        String ans="";
        for(int i=0;i<s.length();i++){
         if(i%2==0) ans+='a';
         else  ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
}
