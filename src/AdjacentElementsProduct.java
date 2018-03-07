public class AdjacentElementsProduct {

	public static void main(String[] args) {
		int[] array = { 3, 6, -2, -5, 7, 3 };
		
		System.out.println(adjacentElementsProduct(array));
		
		
	}

	
	public static int adjacentElementsProduct(int[] inputArray) {
		  int result = Integer.MIN_VALUE;
		    
		    for(int i = 0; i < inputArray.length-1; i++)
		    {
		        int temp = inputArray[i] * inputArray[i+1];
		        if(temp > result)
		        {
		            result = temp;
		        }
		    }
		    
		    return result;
	}
}
