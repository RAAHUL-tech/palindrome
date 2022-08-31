package palindrome;

import java.util.Scanner;

public class strpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reverseStr = "";
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a string...");
	    str=s.next();
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome");
	    }

	}

}
