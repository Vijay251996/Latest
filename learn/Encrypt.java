package learn;

import java.util.Base64;


import org.testng.annotations.Test;



public class Encrypt {
	
	

	@Test
	public void passEncrypt()
	{
		
		String password="Vijay#";
		
		byte[] hide=Base64.getEncoder().encode(password.getBytes());
		
		System.out.println(new String(hide));
		
	    byte[] show=Base64.getDecoder().decode(hide);
			
			System.out.println(new String(show));
		
		
	}
	
}
