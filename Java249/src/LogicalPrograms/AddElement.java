package LogicalPrograms;

import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};  
		int n = arr.length;  
		int newArr[] = new int[n+1];  
		int value = 7;  
		System.out.println("Before addding elements =" + Arrays.toString(arr));  
		for(int i = 0; i<n; i++) {  
		newArr[i] = arr[i];  
		}  
		newArr[n] = value;  
		System.out.println("after adding elements ="
				+ "" +Arrays.toString(newArr));  
		}  
	

}
