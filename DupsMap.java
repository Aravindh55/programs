package Testing;

import java.util.HashMap;
import java.util.Map;

public class DupsMap {

	public static void main(String[] args) {
		String hotelName = "aanandha bhavan";
		char[] charArray = hotelName.toCharArray();
		Map<Character, Integer> lmap = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			lmap.put(charArray[i],lmap.getOrDefault(charArray[i],0)+1 );
//			if (lmap.containsKey(charArray[i])) {
//				lmap.put(charArray[i], lmap.get(charArray[i]) + 1);
//			} else {
//				lmap.put(charArray[i], 1);
//			}
		}
		System.out.println(lmap);
	}

}
