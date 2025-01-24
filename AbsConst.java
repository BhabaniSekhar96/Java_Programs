public abstract class AbsConst
{
    AbsConst()
    {
        System.out.println("Abstract class constructor");
    }

    abstract void m1();
    abstract void m2();

}
  class Jyu extends AbsConst
{
    void m1()
    {
        System.out.println("Child class method");
    }
    void m2()
    {
        System.out.println("Child class method");
    }
    Jyu(int a)
    {
        System.out.println("Child class 1-arg const");
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        Jyu j=new Jyu(10);
        j.m1();
        j.m2();
    }
}
