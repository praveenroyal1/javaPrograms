package LogicalPrograms;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int [] array = new int [] {10,77,3,2,7,88,55};  
		 
		Arrays.sort(array);   
		System.out.println(" array  in ascending order: ");  
		
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   
	}

}
