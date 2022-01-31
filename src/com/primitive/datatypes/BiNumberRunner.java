/**
 * 
 */
package com.primitive.datatypes;

/**
 * @author vjekoslavaleksic
 *
 */
public class BiNumberRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiNumber num = new BiNumber(3,4);
		System.out.println("Sum is:"+num.add());
		System.out.println("Multiply is:"+num.multiply());
		System.out.println("First is:"+num.getNumber1());

	}

}
