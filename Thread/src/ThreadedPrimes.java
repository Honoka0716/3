
public class ThreadedPrimes {
	public static void main(String[] args) {
		int c = 1000000;
		Thread t1 = new Thread() {
			public void run() {
				int j;
				for(int i = 2;i<=c/2;i++) {
					j=2 ;
					while(i%j!=0) {
						j++;
					}
					if (j==i) {
						System.out.println(i);
					}
				}
			}
		
		};
		Thread t2 = new Thread() {
			public void run() {
				int j;
				for(int i = 2;i<=c/2;i++) {
					j=2 ;
					while(i%j!=0) {
						j++;
					}
					if (j==i) {
						System.out.println(i);
					}
				}
			}
		
		};
		Thread t3 = new Thread() {
			public void run() {
				int j;
				for(int i = 2;i<=c/2;i++) {
					j=2 ;
					while(i%j!=0) {
						j++;
					}
					if (j==i) {
						System.out.println(i);
					}
				}
			}
		
		};
		Thread t4 = new Thread() {
			public void run() {
				int j;
				for(int i = 2;i<=c/2;i++) {
					j=2 ;
					while(i%j!=0) {
						j++;
					}
					if (j==i) {
						System.out.println(i);
					}
				}
			}
		
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}	
}