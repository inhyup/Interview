import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class HashTables {
	
	//	Constraints
	//	1 <= m, n <= 30000
	//	1 <= length of any word <= 5
	// 	Each word consists of English alphabetic letters
	// 	The words in the note and magazine are case-sensitive
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        System.out.println(solve(magazine, ransom) ? "Yes" : "No");
        
    }
	
	public static boolean solve(String[] magazine, String[] ransom) {
		Map<String, Integer> magazineMap = new HashMap<>();
		Map<String, Integer> ransomMap = new HashMap<>();
		
		for (String word : magazine) {
			if (!magazineMap.containsKey(word)) {
				magazineMap.put(word, 0);
			}
			magazineMap.put(word, magazineMap.get(word) + 1);
		}
		
		
		for (String word: ransom) {
			if (!ransomMap.containsKey(word)) {
				ransomMap.put(word, 0);
			}
			ransomMap.put(word, ransomMap.get(word) + 1);
		}
		
		for (String key: ransomMap.keySet()) {
			if (!magazineMap.containsKey(key))
			{
				return false;
			}
			int needed = ransomMap.get(key);
			if (magazineMap.get(key) < needed)
			{
				return false;
			}
		}
		
		return true;
	}
}
