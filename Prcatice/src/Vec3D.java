
public class Vec3D {
public double x,y,z;
	
	
	
	public static void main(String[] args) {
		Vec3D v = new Vec3D(0,0,0);
		Vec3D v2 = v.add(new Vec3D(10,5,0));
		double d = v2.dist(v);
		double dsq = v2.distsq(v);
		Vec3D v3 = v.mult(2);
		v.set(1,2,3);
		v.clear();
		
	}
}
}
