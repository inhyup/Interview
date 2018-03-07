import java.util.Arrays;

public class almostIncreasingSequence {

	public static void main(String[] args) {
		int[] array = { 10, 1, 2, 3, 4, 5, 6, 1 };
		
		System.out.println(almostIncreasingSequence(array));

	}

	
	static boolean almostIncreasingSequence(int[] sequence) {
		
		int removed = 0;
		
		for (int i = 0; i < sequence.length-2; i++)
		{
			if (sequence[i] >= sequence[i+1])
			{
				removed++;
				sequence[i] = sequence[i+1] - 1;
			}
			
			if (sequence[i+1] >= sequence[i+2])
			{
				removed++;
				if(sequence[i] == sequence[i+2])
				{
					sequence[i+2] = sequence[i+1] + 1;
				}
				else
				{
					sequence[i+1] = sequence[i];
				}
			}
		}
		
		return removed <= 1;
	}
}
