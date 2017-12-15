import java.io.*;
public class AddressBook implements Serializable,Cloneable {
	private String fname;
	private String lname;
	private String email;
	private String pnumber;
	public AddressBook(String fname,String lname,String email,String pnumber) {
		this.fname=fname; this.lname = lname; this.email = email; this.pnumber = pnumber;
	}
	public boolean equals(AddressBook a) {
		return fname.equals(a.getFname())&&
				lname.equals(a.getLname())&&
				email.equals(a.getEmail())&&
				pnumber.equals(a.getPnumber());
	}
	public AddressBook clone() {
		return new AddressBook(fname,lname,email,pnumber);
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getEmail() {
		return email;
	}
	public String getPnumber() {
		return pnumber;
	}
	public static void main(String[] args) throws IOException {
		AddressBook a = new AddressBook("Tom","Green","1235","342563456");
		FileOutputStream fos = new FileOutputStream("addbook.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();
		AddressBook a1 = a.clone();
		System.out.println(a.equals(a1));
	}
}
