/*
 * Author : Shangshang Han
 */
public class FractionTest {
private int num, den;
public static int gcd(int a, int b) {
	if(b == 0)
		return a;
	return gcd(b,a % b);
}
	
	public FractionTest() {
		num = 0;  den = 1;
	}
	public FractionTest(int n, int d) { 
		int g = gcd(n,d);
		num = n/g; den = d/g;
	}
	void print() {
		System.out.println(num+"/" + den);
	}
	
	
	FractionTest add(FractionTest right) {
		FractionTest ans = new FractionTest();
		ans.num = this.num * right.den + right.num*this.den;
		ans.den = this.den * right.den;
		return ans;
	}
	FractionTest sub(FractionTest right) {
		FractionTest ans= new FractionTest();
		ans.num = this.num * right.den - right.num*this.den;
		ans.den = this.den * right.den;
		return ans;
	}
	FractionTest mult(FractionTest right) {
		FractionTest ans = new FractionTest();
		ans.num = this.num * right.num;
		ans.den = this.den * right.den;
		return ans;
	}
	FractionTest neg() {
		FractionTest ans = new FractionTest();
		ans.num = -this.num;
		ans.den = this.den;
		return ans;
	}
	public static void main(String[] args) {
		for(int i=1; i<3; i++) {
			FractionTest f1 = new FractionTest(i,2);
			FractionTest f2 = new FractionTest(i,3);
		
			FractionTest f3 = f1.add(f2);
			FractionTest f4 = f1.sub(f2);
			FractionTest f5 = f1.mult(f2);
			FractionTest f6 = f1.neg();
		
		
			f3.print();
			f4.print();
			f5.print();
			f6.print();
			/*System.out.println(f1.add(f2));
			System.out.println(f1.sub(f2));
			System.out.println(f1.mult(f2));
			System.out.println(f1.neg());*/
			
		
	}

	}
}
