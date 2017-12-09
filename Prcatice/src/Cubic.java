
public class Cubic {
	private double a,b,c,d;
	public Cubic(double a,double b,double c,double d) {
		this.a=a;this.b=b;this.c=c;this.d=d;
	}
	public Cubic(double b,double c,double d) {
		this(0,b,c,d);
	}
	public double eval(double x) {
		return a*x*x*x+b*x*x+c*x+d;
	}
	Cubic add(Cubic right) {
		return new Cubic(this.a+right.a,this.b+right.b,this.c+right.c,this.d+right.d);
	}
	public Cubic neg() {
		return new Cubic(-a,-b,-c,-d);
	}
	public String toString() {
		String s=new String("");
		s=addElements(s,a,3);
		s=addElements(s,b,2);
		s=addElements(s,c,1);
		s=addElements(s,d,0);
		return s;
	}
	public String addElements(String s,double a,int i) {
		if (a==0) return s;
		else if (a==1) s+=s.length()==0?"":"+";
		else if (a==-1) s+="-";
		else if (a>0) s+=s.length()==0?a:"+"+a;
		else if(a<0)  s+=a;
	    
	    if(i==1) s+="x";
	    else if(i>1) s+="x^"+i;
		return s;
	}
	public static void main(String[] args) {
		Cubic c1 = new Cubic(1,2.5,-1.5,3);
		Cubic c2 = new Cubic(3,-1.0,2.4);
		System.out.println(c2.eval(2));
		Cubic c3 = c1.add(c2);
		Cubic c4 = c1.neg();
		System.out.println(c4);
	}

}
