package WorkShopPrograms;

 class FabnonicSeriesInArray {

	static int fib(int n) {
	
		int f[] =new int[n+2];
	
		
		for(int i=2;i<=n;i++) {
			
			
			f[i]=f[i-1]+f[i-2];
			
		}
		return f[n];
	
		
	}
 

public static void main (String args[]) {
	
	int N=10;
	for (int i=0;i<N;i++) 
		
		System.out.println(fib(i )+"");
	
}
 }
 


		
		
