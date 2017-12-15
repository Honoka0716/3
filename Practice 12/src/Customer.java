import java.io.*;
import java.util.*;
public class Customer {
public static void main(String[] args) throws IOException {
		List<Customers> ls = new ArrayList<>();
		ls.add(new Depositor("Steven","110",112.5));
		ls.add(new Depositor("Dov","111",114.5));
		ls.add(new Depositor("Alice","113",132.5));
		ls.add(new Borrower("Steven",162.5,1,2,2001));
		for(Customers e : ls) {
			e.print();
			
}
		FileOutputStream fos =  new FileOutputStream("book.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ls);
		oos.close();
		
}
}
interface Customers extends Cloneable, Serializable{
		public void print();
}
class Depositor implements Customers{
	private String name;
	private String account;
	private double amount;
	public Depositor(String name, String account, double amount) {
		this.name = name; this.account = account; this.amount = amount;
	}
	public void print() {
		System.out.println("Im a depositor, my name is"+name+"I hava"+amount+" dollars ,My account is "+account);
	}
	public Depositor clone() {
		return new Depositor(name ,account, amount);
	}
	public boolean equals(Depositor a ) {
		return name.equals(a.getname())&&
				account.equals(a.getaccount())&&
				amount == a.getamount();
	}
	public String getname() {
		return name;
	}
	public String getaccount() {
		return account;
	}
	public double getamount() {
		return amount;
	}
}
class Borrower implements Customers{
	private String name;
	private double amount;
	private Date date;
	class Date{
		int year;
		int month;
		int day;
		public Date(int y,int m,int d) {
			y = year;
			m = month;
			d = day;
		}
		public Date(Date d) {
			year = d.year;
			month = d.month;
			day = d.day;
		}
		public String toString() {
			return day+"/"+month+"/"+year;
		}
		public boolean equals(Date d) {
			return year == d.year&&
					month == d.month&&
					day == d.day;
		}
	}
	public Borrower(String name,double amount, int y,int m,int d) {
		this.name =name;
		this.amount = amount;
		this.date = new Date(y,m,d);
	}
	public Borrower(String name,double amount,Date date) {
		this.name = name;
		this.amount = amount;
		this.date = new Date(date);
	}
	public void print() {
		System.out.println("I am a depositor, my name is " + name +
				"I have " + amount + " dollars and should pay back before" +
				date);
	}
	public String getname() {
		return name;
	}
	public double getamount() {
		return amount;
	}
	public Date getDate() {
		return date;
	}
	public boolean equals(Borrower b) {
		return name.equals(b.getname())&&
				amount == b.getamount()&&
				date.equals(b.getDate());
	}
	public Borrower clone() {
		return new Borrower(name,amount,date);
	}
}
