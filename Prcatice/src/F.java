
public class F {
	public static double force(double massEarth,double massMoon,double dist) {
		/* massEarth=5.6e24;
		 massMoon=7.34e22;
		 dist=384472282;*/
		 double G=6.67408e-11;
		 double F=-G*(massEarth*massMoon)/(dist*dist);
		 return F;
		
	}
	public static void main(String[] args) {
		System.out.println(force(5.6e24,7.34e22,38447228));
	}
	
	

}
