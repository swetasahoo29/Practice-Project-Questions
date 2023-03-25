//buffer-builder used when we want to modify strings in use

// public class stringBufferBuilder { //builder-faster tan buffer as its more synchronized

//     public static void main(String args[]) {
//        StringBuffer sBuffer = new StringBuffer("test");
//        sBuffer.append(" String Buffer");
//        System.out.println(sBuffer);  
//     }
//  }

//StringBuilder

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class stringBufferBuilder {
	public static void main(String[] argv) throws Exception
	{
		// Create a StringBuilder object
		// using StringBuilder() constructor
		StringBuilder str = new StringBuilder();

		str.append("SWETA");

		// print string
		System.out.println("String = " + str.toString());

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1
			= new StringBuilder("SWETASAHOO");

		// print string
		System.out.println("String1 = " + str1.toString());

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = "
						+ str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3
			= new StringBuilder(str1.toString());

		// print string
		System.out.println("String3 = " + str3.toString());
	}
}
