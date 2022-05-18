package programForJava;

public class ReverseWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Vijay Rathore";
		char[] ch=str.toCharArray();
		int n=ch.length;
		int start=0; int end=n-1;
		
		while(end>start)
		{
			ch[start]^=ch[end];
			ch[end]^=ch[start];
			ch[start]^=ch[end];
			start++;
			end--;
		}
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]);
		}
	}

}
