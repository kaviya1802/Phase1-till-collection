package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		//Type casting : Process of converting data from one data type to another
		/** Widening Type casting: Converting data from lower range to higher range 
		*byte->short->int->long->float->Double
		**/
		
		byte num = 100; //-128 to 127 -> 1 byte =  8 bits
		
		int IntegerCount = num; //Automatic
		short ShortCount = num;
		long LongCount = num;
		float FloatCount = num;
		double DoubleCount = num;
		
		System.out.println("********************************");
		System.out.println("***Welcome to Narrowing Type Casting***");
		System.out.println("********************************");
		
		System.out.println("Byte Count : "+num);
		System.out.println("Integer Count : "+IntegerCount);
		System.out.println("Short Count : "+ShortCount);
		System.out.println("Long Count :"+LongCount);
		System.out.println("Float Count :"+FloatCount);
		System.out.println("Double Count :"+DoubleCount);
				
		
		/** Narrowing Type casting : Converting data from higher range to lower range
		 * Double->float->long->int->short->byte
		 */
		
		System.out.println("********************************");
		System.out.println("***Welcome to Narrowing Type Casting***");
		System.out.println("********************************");
		
		System.out.println("Please enter the value for Narrowing:"); //User input
		Scanner input = new Scanner(System.in);
		int userIn = input.nextInt();
		
		short ShortValue = (short) userIn; // Conversion
		byte ByteValue = (byte) userIn;
		
		System.out.println("Short Value :" +ShortCount);
		System.out.println("Byte Value :"+ByteValue);
		
			

	}

}
