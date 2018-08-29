package ChifProj;

import org.apache.commons.lang3.RandomStringUtils;

public class Test {
	public static String generateCaseNum(int length) {
		   
	    String allowedChars = "abcdefghijklmnopqrstuvwxyz";
	    String allowedNumbers="1234567890";
	    String CaseNum = "";
	    String temp = RandomStringUtils.random(length, allowedChars);
	    String temp2=RandomStringUtils.random(length, allowedNumbers);
	 //   CaseNum = temp2.substring(0, temp2.length() - 12) + temp.substring(0,temp.length()-16)+temp2.substring(0, temp2.length() - 12)+ temp.substring(0,temp.length()-14);
	       CaseNum = temp2.substring(0, temp2.length() - 16) +"-"+ temp2.substring(0,temp.length()-14)+"-"+
	    		     temp.substring(0, temp2.length() - 16)+"-"+ temp2.substring(0,temp.length()-12)+"-"+
	    		     temp.substring(0,temp.length()-14);
	    return CaseNum;
	    
	}	
public static void main(String args[])
{
	System.out.println(generateCaseNum(18));
}
	
	
}
