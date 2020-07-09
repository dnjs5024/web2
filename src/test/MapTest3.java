package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);
		map.put(3,1);     map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);                                                                                             map.put(2,1);
		map.put(4,1);map.put(2,1);
		map.put(5,1);
		map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);
		map.put(2,1);
		map.put(2,1);
		map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);
		map.put(2,1);
		map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);map.put(2,1);
		Iterator<Integer> sd = map.keySet().iterator();
		while (sd.hasNext()) {
			Integer key = sd.next();
			System.out.println(key + ":" + map.get(key));
		}

		

	}

}
