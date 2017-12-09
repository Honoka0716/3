import java.io.*;
public class AddressBook implements Serializable,Cloneable{
	String fname;
	String lname;
	String email;
	String pnumber;
	public AddressBook(String fname,String lname,String email,String pnumber) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pnumber = pnumber;
	}
	public AddressBook clone() {
		return new AddressBook(fname,lname,email,pnumber);
	}
	public boolean equals(AddressBook a ) {
		return fname.equals(a.fname)&&
				lname.equals(a.lname)&&
				email.equals(a.email)&&
				pnumber.equals(a.pnumber);
	}
	public static void main(String[] args) throws IOException {
		AddressBook a = new AddressBook("Tom","Green","tom@stevens.edu","12345678");
		FileOutputStream fos = new FileOutputStream("Addrbook.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();
		AddressBook a1 = a.clone();
		System.out.println(a.equals(a1));
	}
}
