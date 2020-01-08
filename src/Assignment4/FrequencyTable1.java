package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTable1 {
	public static void main(String[] args) {
		Map<String, IncrementableInteger> table = new HashMap<>();

		for (String s : args) {
			IncrementableInteger counter = table.get(s);
			if (counter == null) {
				table.put(s, new IncrementableInteger(1));
			} else
				counter.increment();
		}

		for (Map.Entry<String, IncrementableInteger> e : table.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}

	}
}
