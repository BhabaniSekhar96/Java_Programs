  abstract class Abstrcat11
{
     abstract void m1();

    abstract void m2();
    static {
        System.out.println("m2");
            }
    abstract void m3();

}
   class Cl extends Abstrcat11
  {
  void m1()
  {
      System.out.println("child class method");

  }
     void m2()
     {
         System.out.println("Child mw2 method");
     }

    void m3()
    {
        System.out.println("Child m3 method");
    }

    public static void main(String[] args)
    {
        Abstrcat11 a=new Cl();
        a.m1();
        a.m2();
        a.m3();

    }
}
