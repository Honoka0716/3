package zoo;

public class zoo {
	public void test1() {
		for(int i = 0; i<1000;i++) {
			Zebra z1 = new Zebra("Alive", 1);
			Zebra z2 = new Zebra("Samir", 3);
			
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i <10;i++) {
		//System.out.println(Zebra.Count());
		System.out.println(Zebra.getCount());
		
	
	}
		System.gc();
		System.out.println(Zebra.getCount());
	}
}
