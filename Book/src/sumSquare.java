
public class sumSquare {
	public static double sumSquare(int[] a ) {
		double sum = 0;
		for (int i = 0;i<a.length;i++) {
			sum+=a[i]*a[i];
			
					
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a = {1,5,1,6};
		System.out.println(sumSquare(a));
	}
}
