
public class matrixElementsSum {

	public static void main(String[] args) {
		int[][] matrix = { 	{1, 1, 1, 0}, 
		          			{0, 5, 0, 1}, 
		          			{2, 1, 3, 10} };
	
		System.out.println(matrixElementsSum(matrix));
	}

	
	static int matrixElementsSum(int[][] matrix) {
	    
		int result = 0;
		for(int i = 0; i < matrix.length-1; i++)
	    {
			
	    	for(int j = 0; j < matrix[i].length; j++)
	    	{
	    		if (matrix[i][j] == 0)
	    		{
	    			matrix[i+1][j] = 0;
	    		}
	    	}
	    }
		
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				result += matrix[i][j];
			}
		}
	    
	    return result;
	}

}
