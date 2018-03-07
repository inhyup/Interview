import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {
	

    static int getTotalX(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < b.length; i++)
        {
        	int temp = 0;
            for (int j = 0; j < a.length; j++)
            {
                if (b[i] % a[j] == 0)
                {
                    temp++;
                }
            }
            if (temp % a.length == 0)
            {
                result++;
            }
        }
        return result;
    }



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();

	}

}
