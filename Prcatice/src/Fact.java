/*import java.lang.*;*/
public class Fact {
	public static long fact(long n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
			
		}
	}
	public static void main(String[] args) {
		double sum=0;
		for(long i =1;i<1000;i=i*2){
			
			sum+=fact(i)/Math.pow(i, i);
		}
		System.out.println(sum);
	}

}
