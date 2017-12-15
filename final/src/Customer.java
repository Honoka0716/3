import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Customer {
	public static void main(String[] arg) {
		List<Customers> ls = new ArrayList<>();
		ls.add(new Depositor("Steven","110",112.5));
		ls.add(new Depositor("Dov","111",114.5));
		ls.add(new Depositor("Alice","113",132.5));
		ls.add(new Borrower("Steven" ,162.5, 1, 2, 2001));
		for(Customers e : ls) {
			e.print();
		}
	}
}
	interface Customers extends Cloneable,Serializable{
		public void print();
	}
class Depositor implements Customers{
		private String name;
		private String account;
		private double amount;
		public Depositor(String name,String account,double amount) {
			this.name = name;
			this.account = account;
			this.amount = amount;
		}
		public void print() {
			System.out.println("I am a depositor, my name is " + name +
				"I have " + amount + " dollars, My account is"
				+ account);
		}
		public String getName() {
			return name;
		}
		public String getAccount() {
			return account;
		}
		public double getAmount() {
			return amount;
		}
		public Depositor clone() {
			return new Depositor(name,account,amount);
		}
		public boolean equals(Depositor d) {
			return name.equals(d.name)&&
					account.equals(d.account)&&
					amount ==d.amount;
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
		public Date(int year,int month,int day) {
			this.year = year;
			this.month = month;
			this.day = day;
			
		}
		public Date(Date d) {
			year = d.year;
			month = d.month;
			day = d.day;
			
		}
		public String toString() {
			return year+"/"+month+"/"+day;
		}
		public boolean equals(Date d) {
			return year == d.year&&
					month == d.month&&
					day ==d.day;
		}
	}
	public Borrower(String name,double amount,int y,int m ,int d) {
		this.name = name;
		this.amount = amount;
		this.date = new Date(y,m,d);
	}
	public Borrower(String name ,double amount,Date date) {
		this.name = name;
		this.amount = amount;
		this.date = new Date(date);
	}
	public void print() {
		System.out.print("I am a depositor, my name is " + name +
				"I have " + amount + " dollars and should pay back before" +
				date);
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	public Date getDate() {
		return date;
	}
	public boolean equals(Borrower b) {
		return name.equals(b.name)&&
				amount == b.amount&&
				date.equals(b.getDate());
	}
	public Borrower clone() {
		return new Borrower(name,amount,date);
	}
}

