/*
* Copyright (c) 2021. All Rights Reserved.
*/
package com.bit.manipulation;

/**
 * Given a number find whether its even or odd number
 * 
 * Important Note: In binary format, if the last bit will be zero for even number and 1 for odd number
 *                 2 -> 010
 *                 4 -> 100
 *                 6 -> 110
 *                 
 *                 3 -> 011
 *                 7 -> 111
 *                 9 ->1001
 *                 
 * @author rohitgaikwad09
 *
 */
public class EvenOdd {

	public static void main(String[] args) {
		evenOddByMasking(6);
		evenOddByMasking(7);

	}
	
	/**
	 * Use Bit Masking to find last bit. That is mask with number 1.
	 * 
	 * e.g: 7 -> 7 & 1 =  1101
	 *                  & 0001
	 *                    0001 -> 7 is an Odd Number
	 *      6 -> 6 & 1 =  110
	 *                  & 001
	 *                    000  -> 6 is an even number
	 * @param number
	 * @return
	 */
	public static void evenOddByMasking(int number) {
		if ((number & 1) == 0)
			{
			System.out.println(number + " is an even numer");
			}
		else {
			System.out.println(number + " is an odd numer");
		}

	}

}
