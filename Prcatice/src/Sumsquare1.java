
public class Sumsquare1 {
	public static double Sumsquare1(int[] a) {
		double sum=0;
		for(int i=0,len=a.length;i<len;i++) {
			sum+=a[i]*a[i];
			
		}
		return sum;
	}
	
public static void main(String[] args) {
	int[] a= {1,5,1,6};
	System.out.println(Sumsquare1(a));
}
}
