


public class asd {
    private int x;
    public static void main(String[] args) {
        B b1 = new B();
        b1.f();
        A a1 = new A();
        a1.f();
        C c1; // LEGAL
        //c1 = new C(); // ILLEGAL CANNOT INSTANTIATE an interface
        D d1; // lEGAL
        //D d2 = new D();
        E e1 = new E();
        e1.h();
        
        //anonymous inner class
        D d2 = new D() { // testReview.InheritanceTypes$1
           public void h() { System.out.println("testing"); } 
        };
        d2.h();
    }

// inner class automatically has a pointer to the outer    
    class F extends D {
        public void h() {
            System.out.println(x);
        }
    }
    // static variables have no pointer
    static class G { // name is testReview.InheritanceTypes.G
        
    }
}

class A {
    public void f() { System.out.println("f"); }
}

class B extends A {
    public void f() { System.out.println("g"); }
}

interface C {
    public void h();
}

interface C2 extends C {
    public void i();    
}

abstract class D implements C {
}

class E extends D {
    public void h() { System.out.println("h"); }
}





