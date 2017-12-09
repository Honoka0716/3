package sdf;

public class A {
	public static double force(double massEarth,double massMoon,double dist) {
		double G = 6.67e-11;
		return -G*massEarth*massMoon/(dist*dist);
	}
	public static void main(String[] args) {
		System.out.println(force(5.6e24,7.34e22,384472282));
	}

}
