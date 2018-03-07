import java.util.Arrays;

public class arrayConsecutive {
	public static void main(String[] args) {
		int[] array = { 6, 2, 3, 8 };
		System.out.println(makeArrayConsecutive2(array));
	}
	
	static int makeArrayConsecutive2(int[] statues) {
	    int result = 0;
		Arrays.sort(statues);
	    for (int i = 0; i < statues.length-1; i++)
	    {
	    	if(statues[i+1] - statues[i] > 1)
	    	{
	    		int temp = statues[i+1] - statues[i] - 1; 
	    		result += temp; 
	    	}
	    }
		return result;
	}

}
