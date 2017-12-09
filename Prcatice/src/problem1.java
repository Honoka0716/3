
public class problem1 {
public static double Fact(int n) {
	double prod=1;
	for(int i=1;i<=n;i++) {
		prod*=i;
	}
	return prod;
}
public static double Fact2(int n) {
	if(n==0)
		return 1;
	else
		return n*Fact2(n-1);
}
public static void main(String[] args) {
	System.out.println(Fact(10));
	System.out.println(Fact2(5));
}
}

