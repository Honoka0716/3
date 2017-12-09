import java.io.*;
public class AddressBook implements Serializable,Cloneable{
private String fname;
private String lname;
private String email;
private String Pnumber;
public AddressBook(String fname,String lname, String email,String Pnumber) {
	this.fname = fname;
	this.lname = lname; 
	this.email = email;
	this.Pnumber = Pnumber;
}
public AddressBook clone() {
	return new AddressBook(fname,lname,email,Pnumber);
}
public boolean equals(AddressBook a) {
	return fname.equals(a.fname)&&
		   lname.equals(a.lname)&&
		   email.equals(a.email)&&
		   Pnumber.equals(a.Pnumber);
}
public static void main(String[] args) throws IOException {
	AddressBook a = new AddressBook("Tom","Green","Tom@stevens.edu","22222");
	FileOutputStream fos = new FileOutputStream("addrbook.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a);
	oos.close();
	AddressBook a1 = a.clone();
	System.out.println(a.equals(a1));
}
}
