package programForJava;

import java.util.Stack;

public class BalancedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="{()}[]";
		
		 Stack<Character> str1 = new Stack<Character>();
		for(int i=0; i<str.length();i++)
		{
		if(str.charAt(i)=='{'|| str.charAt(i)=='(' || str.charAt(i)=='[')
		{
			str1.push(str.charAt(i));
		}
		else if(!str1.empty()&&((str.charAt(i)==']'&& str1.peek()=='[') || (str.charAt(i)=='}'&& str1.peek()=='{')||
				 (str.charAt(i)==')'&& str1.peek()=='(')))
		{
			str1.pop();
		}
		else
		{
			str1.push(str.charAt(i));
		}
		
	}
		if(str1.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}

