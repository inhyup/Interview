import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ApplesAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        
	int numApple = 0;
    	int numOrange = 0;
    	
        for (int i = 0; i < apples.length; i++)
        {
        	int appleDist  = a + apples[i];
        	if (appleDist >= s && appleDist <= t)
        	{
        		numApple++;
        	}
        }
        for (int i = 0; i < oranges.length; i++)
        {
        	int orangeDist  = b + oranges[i];
        	if (orangeDist >= s && orangeDist <= t)
        	{
        		numOrange++;
        	}
        }
        System.out.println(numApple);
        System.out.println(numOrange);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
