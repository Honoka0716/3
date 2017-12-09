
public class Vec3d {
	private double x,y,z;
	public Vec3d(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	public String toString() {
		return "("+x+","+y+","+z+")";
	}
	public Vec3d add(Vec3d a ) {
		return new Vec3d(x+a.x,y+a.y,z+a.z);
	}
}
