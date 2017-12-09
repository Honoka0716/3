 import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class Practice{

	

	public static void main(String[] args) {
		// will read information from a file
		// format:
		// Cat Alice 15.9 5
		// Dog Steve 8.8 7
		// Cat CarMen 7.2 6
		// use some data structure to make sure we can find an animal by the name quickly
		Map<String, Animals> Animals = new HashMap<>();
		
		try {
			File f = new File("Animals.txt");
			Scanner sc = new Scanner(f);
			String s;
			while(sc.hasNextLine()) {
				s = sc.nextLine();
				String[] animals = s.split(" ");
				String type = animals[0];
				String name = animals[1];
				double weight = Double.parseDouble(animals[2]);
				int age = Integer.parseInt(animals[3]);
				if(type.equals("Dog")) {
					Animals.put(name, new dog(name,weight,age));
					
				}
				if(type.equals("Cat")) {
					Animals.put(name, new cat(name,weight,age));
				}
				if(Animals.containsKey("Alice")) {
					System.out.println(Animals.get("Alice").print());
				}
				else {
					System.out.println("asdasda");
				}
				sc.close();
			}
		} catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}

abstract class Animals {
		private String name;
	private double weight;
	private int age;
	public Animals(String name, double weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	public abstract String print();
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
}

class dog extends Animals{
	
	public dog(String name, double weight, int age) {
		super(name,weight,age);
		
		
		
	}
	public String print() {
		return "I am a dog"+super.getname()+"my age is"+super.getage();
		}
}

class cat extends Animals{
	public cat(String name,double weight,int age) {
		
		super(name,weight,age);
	}
	public String print() {
		return "I am a cat"+super.getname()+"my age is"+super.getage();
	}
}