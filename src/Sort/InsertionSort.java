package Sort;

public class InsertionSort {

	public static void insertion_sort(int[] array)
	{
		for (int i = 1; i < array.length; i++)
		{
			int key = array[i];
			int j = i - 1;
			
			while ((j > -1) && (array[j] > key))
			{
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12 ,34, 0, 1};
		insertion_sort(input);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		
		}
	}
}
