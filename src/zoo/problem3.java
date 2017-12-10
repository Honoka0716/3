package zoo;

public class problem3 {
public static double cosine(int x,int n) {
	int num=1;int den=1;double sum=0;
	for(;n>=0;n--) {
		if(n%2==0) {
			sum=sum+num*1.0/den;
		}
		num*=x;
		den*=n;
	}
	return sum;
	
}
public static void main(String[] args) {
	System.out.println(cosine(10,10));
}
}
