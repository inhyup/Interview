package Sort;

public class BubbleSort {

	
	public static void bubble_sort(int[] array)
	{
		int temp = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 1; j < array.length - i; j++)
			{
				if (array[j - 1] > array[j])
				{
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] input = { 4, 2, 9, 6, 23, 12 ,34, 0, 1};
		bubble_sort(input);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}
	}

}
