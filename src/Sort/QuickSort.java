package Sort;

public class QuickSort {
	
	
	public void quick_sort(int[] array, int b, int e)
	{
		if (b < e)
		{
			int pivot = partition(array, b, e);
			
			quick_sort(array, b, pivot - 1);
			quick_sort(array, pivot + 1, e);
			
		}
	}
	
	public int partition(int[] array, int b, int e)
	{
		int pivot = array[e];
		
		int i = b - 1;
		for (int j = b; j < e; j++)
		{
			if (array[j] <= pivot)
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i + 1];
		array[i + 1] = array[e];
		array[e] = temp;
		
		return i + 1;
	}
	
	public static void main(String[] args) {
		
		int[] input = {4, 2, 9, 6, 23, 12 ,34, 0, 1};
		QuickSort qs = new QuickSort();
		qs.quick_sort(input, 0, input.length - 1);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}

	}

}
