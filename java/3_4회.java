Interface A{
    int a=2;
}
class B implements A{
    int b;
    b(int i){b=i*a;}
    int gerb(){return b;}
}
public class Test{
    public static void main(String[] args)
    int a=3;
    B b1=new B(1);
    system.out.println(b1.getb());
}