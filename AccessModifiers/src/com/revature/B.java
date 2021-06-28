package com.revature;

// Note: B is not a subclass of A
public class B {

	public static void main(String[] args) {
		System.out.println(A.a); // public, so this works
		System.out.println(A.b); // protected, so this works
		System.out.println(A.c); // default, so this works
		// System.out.println(A.d); // private, so this doesn't work
		// We are not inside the same class as that particular static variable
	
		A obj = new A(10, -153, 65, -10);
		System.out.println(obj.w); // public
		System.out.println(obj.x); // protected
		System.out.println(obj.y); // default
		// System.out.println(obj.z); // private, does not work
	}
	
}
