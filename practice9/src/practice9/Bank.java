package practice9;
import java.io.*;

interface bank extends Cloneable, Serializable {
	public void print();
}
	

class depositer implements bank{
	private String account;
	private double amount;
	private String name;
	public depositer (String name, String account, double amount) {
		this.name = name;
		this.account = account;
		this.amount = amount;
	}
	public String toString() {
		return "my name is"+name;
	}
	public depositer clone() {
		return new depositer(name , account ,amount);
		
	}

	public void print() {
		
		
	}
}
class borrower implements bank{
	private String name;
	private double amount;

	class date{
		private int year,month,day;
		public String date(int year,int month,int day) {
			this.year=year;
			this.month = month;
			this.day = day;
			return month+"/"+day+"/"+year;
		}
	}
	public borrower(String name, double amount, date d) {
		this.name = name;
		this.amount = amount;
		date d1 = new date();
	}
	public void print() {
		
		
	}
}
public static void main(String args)throws FileNotFoundException, IOException {
	depositer d1 = new depositer("asd","123",234);
	borrower b1 = new borrower("bcd",123,date("93","july","16"));
