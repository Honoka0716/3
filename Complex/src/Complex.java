/*
 * Author : Shangshang Han
 */

public class Complex {
	private double real, imag;
	public Complex() {
		real=0 ; imag=1;
	}
	public Complex(double a,double b) {
		real=a ; imag=b;
	}
	void print() {
		if(imag>0) {
		System.out.println(real+"+"+imag+"i");
		}
		if(imag<0) {
	    System.out.println(real+""+imag+"i");
		}
		if(imag==0) {
		System.out.println(real);	
		}
		
			
	}
	Complex add(Complex right) {
		Complex ans =  new Complex();
		ans.real = this.real + right.real;
		ans.imag = this.imag + right.imag;
		return ans;
	}
	Complex mult(Complex right) {
		Complex ans = new Complex();
		ans.real = this.real * right.real - this.imag * right.imag;
		ans.imag = this.imag * right.real + this.real * right.imag;
		return ans;
	}
	Complex sub(Complex right) {
		Complex ans = new Complex();
		ans.real = this.real - right.real;
		ans.imag = this.imag - right.imag;
		return ans;
	}
	Complex neg() {
		Complex ans = new Complex();
		ans.real = 0 - this.real;
		ans.imag = 0 - this.imag;
		return ans;
	}
	Complex conj() {
		Complex ans = new Complex();
		ans.real = this.real;
		ans.imag = 0 - this.imag;
		return ans;
	}
	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(1.5,2);
		Complex c3 =  c1.add(c2);
		Complex c4 =  c1.mult(c2);
		Complex c5 =  c1.sub(c2);
		Complex c6 = c1.neg();
		Complex c7 = c1.conj();
		c1.print();
		c2.print();
		c3.print();
		c4.print();
		c5.print();
		c6.print();
		c7.print();
	}

}
