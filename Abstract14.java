public abstract class Abstract14
{
    abstract void m1();

    abstract void m2();

    abstract void m3();

    abstract void m4();
}
abstract  class Test14 extends Abstract14
{
    @Override
    void m1()
    {
        System.out.println("m1 method");
    }
}
abstract class Test15 extends Test14
{
    void m2()
    {
        System.out.println("m2 method");
    }
}
abstract class Test16 extends Test15
{
    void m3()
    {
        System.out.println("m3 method");
    }
}

 class Test17 extends Test16
{


    @Override
    void m4()
    {
        System.out.println("m4 method");
    }

    public static void main(String[] args)
    {
        Test17 tr=new Test17();
        tr.m1();
        tr.m2();
        tr.m3();
        tr.m4();
    }
}


