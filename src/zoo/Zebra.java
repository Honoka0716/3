package zoo;

public class Zebra {
   private String name;
   private int age;
   private static int count;
   public Zebra(String name, int age) {
	   this.name = name;
	   this.age = age;
	   count++;
   }
   public void finalize() {
	   count++;
   }
   public static int getCount() {return count;}
  // public int getCount() {return count;}
   
}
