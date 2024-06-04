import org.w3c.dom.ls.LSOutput;

class A
{
    public void meth()
    {
        System.out.println("Invoking method from class A");
    }
}




public class B extends A {

    public void meth()
    {
        System.out.println("Method is overridden in Extended class B");
    }
    public static void main(String[] args) {
        A a = new B();
        a.meth();
        a.meth();

    }
}
