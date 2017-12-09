
public class Cubic1 {
private int a,b,c,d;
public Cubic1(double a,double e ,double f,int d) {
	this.a=a;
	this.b=e;
	this.c=f;
	this.d=d;
}
public Cubic1(int b ,int c,int d) {
	this(0,b,c,d);
}
public double eval(double x) {
	return a*x*x*x+b*x*x+c*x+d;
}
public Cubic1 add(Cubic1 x) {
	return new Cubic1(a+x.a,b+x.b,c+x.c,d+x.d);
}
public Cubic1 neg() {
	return new Cubic1(-a,-b,-c,-d);
}
public String tostring() {
	String res = "";
	res=addElement(res,a,3);
	res=addElement(res,b,2);
	res=addElement(res,c,1);
	res=addElement(res,d,0);
	return res;
}
public String addElement(String s,double a,int i) {
	if(a==0) return s;
	if(a==-1) s+="-";
	if(a==1) s+=s.length()<1?"":"+";
	if(a<0) s+=a;
	if(a>0) s+=s.length()<1?""+a:"+"+a;
	if(i>=2) s+="x^"+i;
	else if(i==1) s+="x";
	return s;
}
public static void main(String[] args) {
	Cubic1 c1= new Cubic1(1,2.5,-1.5,3);
	
}
}
