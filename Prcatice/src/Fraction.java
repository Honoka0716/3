
public class Fraction {
	private int num, den;
	
	public Fraction() {
		num = 0;  den = 1;
	}
	public Fraction(int n, int d) { 
		num = n; den = d;
	}
	
	void print() {
		System.out.println(num+"/"+den);
	}
	Fraction add(Fraction right) {
		Fraction ans = new Fraction();
		ans.num = this.num*right.den + this.den*right.num;
		ans.den = this.den*right.den;
		return ans;
	}
	public static void main(String[] args) {
	Fraction f1 = new Fraction(1,2);
	Fraction f2 = new Fraction(2,3);
	Fraction f3 = f1.add(f2);
	f1.print();
	f2.print();
	f3.print();
	}
	}
