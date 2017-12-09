
public class Factorial {
	public static double fact(int n) {
		double prod =1;
		for (int i=1;i<=n;i++)
			prod*=i;
		return prod;
	}
	public static double fact2(int n) {
		if(n<=0)
			return 1;
		else
		return n*fact2(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact2(10));
	}

}
