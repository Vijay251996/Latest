package programForJava;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String args[]) {
		
		int a[]= {1,2,2,3,4,5,3};
		
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 
		 for(int i=0;i<a.length;i++)
		 {
			 int count=0;
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 count++;
				 }
			 }
			 if(count<=0)
			 {
				 arr.add(a[i]);
			 }
		 }
		 
		 for(Integer cou:arr)
		 {
			 System.out.println(cou);
		 }
		 
		

	}
}
