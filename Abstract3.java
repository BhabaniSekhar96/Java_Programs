public class Abstract3 {

    Abstract3()  // inside abstartct class constructor declaration is possible
    {
        System.out.println("Abstrcat class constructor");
    }
}
class Re extends Abstract3
{
    void m1()
    {
        System.out.println("m1 method");
    }
    Re()
    {
        //super();  by default as in parent class o-arg consturutor is present
        System.out.println("Normal class constructor");
    }

    public static void main(String[] args) {
        Re t=new Re();
        t.m1();
    }
}
