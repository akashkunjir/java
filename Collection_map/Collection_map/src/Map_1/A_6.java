 package Map_1;

import java.util.*;

public class A_6 {

	public static void main(String[] args) {
		Map<Character, Integer> list = new TreeMap<>();
		String str1 = "maharashtra";
		/*coccacola
		 * for printing position, char of a string Map<Integer, Character> list = new
		 * TreeMap<>(); for (int i = 0; i < str1.length(); i++) { list.put(i,
		 * str1.charAt(i)); }
		 * 
		 */
		for (int i = 0; i < str1.length(); i++) {
			if (list.containsKey(str1.charAt(i))) {
				int no = list.get(str1.charAt(i));
				no++;
				list.put(str1.charAt(i), no);
			} else {
				list.put(str1.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> e : list.entrySet()) {
			System.out.println("\t" + e.getKey() + "\t" + e.getValue());
		}
	}
}
