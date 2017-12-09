
public class Person {
	String fname;
	String lname;
	String age;
	public Person(String fname,String lname,String age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public String toString() {
		return fname+","+lname+","+age;
	}
	public static void main(String[] args) {
		Person p1 = new Person("Tom","Green","21");
		Person p2 = new Person("Green","Tom","22");
		System.out.println(p1);
		System.out.println(p2);
	}
}
