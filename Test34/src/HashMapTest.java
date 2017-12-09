import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String,Double> map = new HashMap<>();
		map.put("AAPL",123.2);
		map.put("IBM", 55.0);
		map.put("MSFT", 64.7);
		double val = map.get("MSFT")+1;
		map.put("MSFT",val);
		for(Map.Entry<String, Double> e: map.entrySet()) {
			System.out.println(e.getKey()+","+e.getValue());
		}
	}
}
