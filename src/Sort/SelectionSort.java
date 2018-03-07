package Sort;

public class SelectionSort {

	public static void selection_sort(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			int index = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[index])
				{
					index = j;
				}
			}
			
			int smallerNumber = array[index];
			array[index] = array[i];
			array[i] = smallerNumber;
		}
		
	}
	
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12 ,34, 0, 1};
		selection_sort(input);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}

	}

}
