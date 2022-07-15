package org.test;

public class ReturnTypeClassB {
	public static void main(String[] args) {
		ReturnTypeClassA a = new ReturnTypeClassA();
		int d = a.add(20, 25);
		if (d==50) {
			System.out.println("Valid");
		} else {
            System.out.println("Invalid");
		}
		
	}

}
