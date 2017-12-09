
public class cosine {
	private int x,n;
	public cosine(int x, int n) {
		this.x=x;this.n=n;
	}
public double cosine(int x,int n) {
	this.x=x;
	this.n=n;
	double res=1;
	double time=1;
	double fact=1;
	for (int i =1;i<=n;i++) {
		if(i%2==0);
	time*=x;
	fact*=i;
	res+=time/fact;
}
	return res;
			
	
}
public static void main(String[] args) {
	cosine c1=new cosine(1,5);
	System.out.println(c1);
}
}
