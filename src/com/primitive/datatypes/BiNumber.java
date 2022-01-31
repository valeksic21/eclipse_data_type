/**
 * 
 */
package com.primitive.datatypes;

/**
 * @author vjekoslavaleksic
 *
 */
public class BiNumber {
	
	private int first;
	private int second;

	BiNumber (int first, int second) {
		this.first=first;
		this.second=second;
	}
	
	int add() {
		//handles math adding
		return first+second+4;
	}
	
	int multiply() {
		return first*second;
	}
	
	int getNumber1() { 
		return first;
	}	

	int getNumber2() { 
		return second;
	}	

	
}
