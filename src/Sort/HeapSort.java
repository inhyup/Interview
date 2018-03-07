package Sort;

public class HeapSort {

	public void sort(int[] array)
	{
		for (int i = array.length / 2 - 1; i >= 0; i--)
		{
			heapify(array, array.length, i);
		}
		
		for (int i = array.length - 1; i >= 0; i--)
		{
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array, i, 0);
		}
	}
	
	//n = length of array
	//i = index
	public void heapify(int[] array, int n, int i)
	{
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if (left < n && array[left] > array[largest])
		{
			largest = left;
		}
		
		if (right < n && array[right] > array[largest])
		{
			largest = right;
		}
		
		if (largest != i)
		{
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;
			
			heapify(array, n, largest);
		}
	}
	
	public static void main(String[] args) {
		int[] input = {4, 2, 9, 6, 23, 12 ,34, 0, 1};
		HeapSort hs = new HeapSort();
		hs.sort(input);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}

	}

}
