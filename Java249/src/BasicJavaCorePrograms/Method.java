package BasicJavaCorePrograms;

public class Method {

	static 	int n1= 0,n2=1,n3,sum;
	static void fib( int count) {
		 if (count>0) {
			
			 n3=n1+n2;
			 
			 if(n3%2==0) {
				 System.out.println("even :"+n3);
				 sum=n3;
			 }
		
			 n1=n2;
			 n2=n3;
			
			 System.out.println(""+n3);
			
			 fib(count-1);
		 }
	
			
	}
	
public static void main(String[] args) {
	
	int count=10;
	
	
	//System.out.println(n1+""+n2);
	fib(count-2);
	//System.out.println("even  numbers:-"+sum);
	

}

}
