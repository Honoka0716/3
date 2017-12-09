package zoo;

public class problem4 {
public static double force(double em,double mm,double dist) {
	double F=0;
	final double G=6.67408e-11;
	F=-((G*em*mm)/(dist*dist));
	return F;
}
public static void main(String[] args) {
	System.out.println(force(5.6e24,7.34e22,384472282));
}
}
