

public class B {
	public static double cosin(int x , int n) {
		int num = 1 ; int den = 1; double sum = 0;
		for(;n>0;n--) {
			if(n%1==0) {
				sum=sum+num*1.0/den;
			}
				num*=n;
				den*=x;
				
			
			
		}return sum;
	}
	public static void mian(String[] args) {
		System.out.println(cosin(2,4));
	}
}
