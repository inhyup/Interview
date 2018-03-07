package codefights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class firstDuplicate {

	public static void main(String[] args) {
		int[] array = { 2, 3, 3, 1, 5, 2 };
		System.out.println(firstDuplicate(array));
	}

	static int firstDuplicate(int[] a)
	{
		 Map<Integer, Integer> second = new HashMap<Integer, Integer>();
         Set<Integer> first = new HashSet<Integer>();
         for (int i = 0; i < a.length; ++i) {
            int num = a[i];
            if (first.contains(num) && !second.containsKey(num)) {
               second.put(num, i);
            }
            first.add(num);
         }
         int selected = -1;
         int minIndex = a.length;
         for (Map.Entry<Integer, Integer> entry : second.entrySet()) {
            if (entry.getValue() < minIndex) {
               minIndex = entry.getValue();
               selected = entry.getKey();
            }
         }
         return selected;
	}
}
