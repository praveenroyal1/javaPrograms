package LogicalPrograms;

public class ArrayOddPosition {

	public static void main(String[] args) {
		  int [] arr = new int [] {1, 2, 6, 4, 5,6,7,8,9};  
	        System.out.println("Elements of given array present on odd position: ");  
	       
	        for (int i = 0; i <arr.length; i = i+2) {  
	            System.out.println(arr[i]);  
	        }  

	}

}
