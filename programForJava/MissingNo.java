package programForJava;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,4,5,6};
		int n=0;
		int sum=0;
		
		int result=0;
		
		 
		 for(int i=0;i<a.length;i++)
		 {
			 n=n+a[i];
			 
		 }
		 for(int j=1; j<=a.length;j++) {
				sum=sum+j; 
				
			 }
		 System.out.println(n);
		
		 System.out.println(sum);
         result=n-sum;
         System.out.println(result);
	}

}
