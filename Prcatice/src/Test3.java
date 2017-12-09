
public class Test3 {
public interface Y{
	public void f();
}
public abstract class X implements Y {
	private int x;
	public X() {
		this.x=2;
	}
public class Z extends X{
	public void f() {
		
	}
}
public abstract class F implements Y{
	private int y;
	public F(int x) {
		
	}
	public String toString() {
		return "F" + y;
	}
	public  void main(String[] args) {
		System.out.println("TEST");
	}
}
}

public static void main(String[] args) {
	Z z1 = new Z();
	Y y1 = new Z();
	Z z2 = new Y();
	F f1 = new F(1);
	F f2 = new Z(2);
	Z z3 = new F(3);
	Y y2;
	Y y3 = new Y();
	X x1;
	Y x2 = new X();
	X x3 = new Y();
	Z z4;
}
}