interface  Ismaple1{
    void play();
}
interface Isample2{
     int  play(int a);
}
class ImplInterface implements Ismaple1,Isample2{
    public void play(){
        System.out.println("Play cricket with first class");
    }
    public int play(int a){
        return 10;
    }


}
public class IneuronPr {
    public static void main(String[] args) {
        Isample2 i=new ImplInterface();
        System.out.println(i.play(1));
        Ismaple1 i1=new ImplInterface();
        i1.play();
    }
}
