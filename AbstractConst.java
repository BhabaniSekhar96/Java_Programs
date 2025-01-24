abstract class AbstractConst
{
    AbstractConst()  //Inside abstartct class constructor decalration also possible
    {
        System.out.println("Abstract class constructor");
    }

   abstract void m1();
}

class Xy extends AbstractConst
{
    Xy()
    {
        System.out.println("Child class constructor");
    }

    @Override
    void m1()   //call to super class constructor will be by default
    {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        Xy x=new Xy();
        x.m1();
    }
}
