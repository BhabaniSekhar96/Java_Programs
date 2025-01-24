abstract class Abstract1 {
    abstract void m1();
    static {
        System.out.println("m12555 method");
    }
    abstract void m2();
    abstract void m3();
    abstract void m4();
    static void m5()
    {
        System.out.println("Mnfg methods");
    }

}
 class Cvb extends Abstract1
{
    void m1()
    {
        System.out.println("m1 method");
    }
    void m2()
    {
        System.out.println("m2 method");
    }
    void m3() {
        System.out.println("m3 methoids od abstacrat");
    }

    @Override
    void m4() {
        System.out.println("m4 method");
    }
    static void m5() //static method, you don't actually override it hide the method in the subclass
    {                //the static method m5() in Cvb does not override the static method in Abstract1; it hides it.
        System.out.println("Army dog");
    }

    public static void main(String[] args) {
   //     Abstract1 t=new Abstract1();
        //Cvb y=new Cvb();
        Abstract1 y=new Cvb();
        y.m1();
        y.m2();
        y.m3();
        y.m4();
        y.m5(); //the static method m5() in Cvb does not override the static method in Abstract1; it hides it & it will not print

        }
    }

