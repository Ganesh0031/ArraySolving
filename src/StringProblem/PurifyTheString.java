package StringProblem;

public class PurifyTheString {
    public static void main(String[] args) {
        String []arr={"0011","4","5"};
        String maxs=arr[0];
        for(int i=0;i<arr.length;i++){
            maxs=max(maxs,arr[i]);


        }
        System.out.println(maxs);
    }
    public  static  String max(String a,String b){
        String s=purify(a);
        String t=purify(b);
        if(s.length()>t.length())return s;
        else if(t.length()>s.length())return t;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            int val1=(int)ch;
            int  val2=(int)ch;
            if(val1>val2){
                return a;
            }
            else return b;
        }
        if(a.length()>b.length())return a;
        return b;
    }
    public static  String purify(String a){
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch!='0')return a.substring(i);

        }
        return a;
    }
}
