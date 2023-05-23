package maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	private static final String KPABLOO = "Pabloo";
	private static final String KVIRGILE = "Virgile";

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put(KPABLOO, 28);
		map.put(KVIRGILE, 25);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			printEntry(entry);
		}
	}

	static void printEntry(Map.Entry<String, Integer> entry) {
		System.out.println(entry.getKey() + "->" + entry.getValue());

	}

}
