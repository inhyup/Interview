
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseLinkedList {

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
	}

	
	public static int numberNeeded(String first, String second) {
        int[] numLetter = new int[26];

        for (char c : first.toCharArray())
        {
            numLetter[c-'a']++;
        }
        
        for (char c : second.toCharArray())
        {
            numLetter[c-'a']--;
        }
        
        int result = 0;
        for (int i : numLetter)
        {
            result += Math.abs(i);
        }
        return result;
    }
}


	

