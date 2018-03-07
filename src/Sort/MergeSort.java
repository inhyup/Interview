package Sort;

public class MergeSort {

	public void merge(int[] array, int b, int m, int e)
	{
		int n1 = m - b + 1;
		int n2 = e - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for (int i = 0; i < n1; ++i)
		{
			L[i] = array[b + i];
		}
		
		for (int j = 0; j <n2; ++j)
		{
			R[j] = array[m + 1 + j];
		}
		
		int i = 0, j = 0;
		
		int k = b;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				array[k] = L[i];
				i++;
			}
			else 
			{
				array[k] = R[i];
				j++;
			}
			k++;
		}
		
		while (i < n1)
		{
			array[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2)
		{
			array[k] = R[j];
			j++;
			k++;
		}
	}
	
	
	public void sort(int[] array, int b, int e)
	{
		if (b < e)
		{
			int m = (b + e) / 2;
			
			sort(array, b, m);
			sort(array, m + 1, e);
			
			merge(array, b, m, e);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] input = {4, 2, 9, 6, 23, 12 ,34, 0};
		MergeSort ms = new MergeSort();
		ms.sort(input, 0, input.length - 1);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}
	}

}
