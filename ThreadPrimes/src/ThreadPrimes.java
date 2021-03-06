
import java.util.*;



public class ThreadPrimes {
	List<Integer> ls;
	int total;
	int numsCPU;
	class MyThreadPrimes extends Thread {
		private int start;
		private int end;
		public MyThreadPrimes(int s, int e) {
			start = s;
			end = e;
		}
		public void run() {
			for(int i = start; i<=end; i+=3) {
				 putNum(i);
				System.out.println(i);
			}
		};
		
		public synchronized void putNum(int n) {
			ls.add(n);
		}
	}
	public ThreadPrimes(int t, int c) {
		total = t;
		numsCPU = c;
		int s = 0;
		int e = total / numsCPU;
		ls = new ArrayList<>(1000);
		for(int i = 0; i < numsCPU; i++) {
			Thread t1 = new MyThreadPrimes(s, e);
			t1.start();
			s = e + 1;
			e += total / numsCPU;
		}
	}
	
	public static void main(String[] arg) {
		ThreadPrimes t = new ThreadPrimes(100000, 2);
	}
}
