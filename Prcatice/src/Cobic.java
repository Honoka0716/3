
public class Cobic {
	private double a,b,c,d;
	public Cobic(double a,double b,double c,double d) {
		this.a = a; this.b =b;
		this.c = c; this.d =d;
	}
	void print() {
		System.out.println(this);
	}
	public String toString() {
		String s = new String();
		if(a != 0) s += a + "x*x*x";
		if(b != 0) s += b + "x*x";
		if(c != 0) s += c + "x";
		if(d != 0) s += d;
		return s;
	}
	public double eval(double x) {
		double res = 0;
		res = a * x * x * x + b * x *x + c * x + d;
		return res;
	}
	Cobic add(Cobic right) {
		return new Cobic(this.a+right.a, this.b+right.b, 
					     this.c+right.c, this.d+right.d);
	}
	public static void main(String[] args) {
		Cobic c1= new Cobic(1,2,3,4);
		Cobic c2= new Cobic (2,3,4,5);
		Cobic c3=c1.add(c2);
		c1.print();
		c2.print();
		c3.print();
		System.out.println(c1);
		System.out.println(c3.eval(4));
		
	}

}
