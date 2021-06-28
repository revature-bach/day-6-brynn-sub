package com.revature.other;

import com.revature.A;

public class C extends A {

	public C(int w, int x, int y, int z) {
		super(w, x, y, z);
	}
	
	public static void main(String[] args) {
		System.out.println(A.a); // public, so this works
		System.out.println(A.b); // protected, so this doesn't work
		// System.out.println(A.c); // default, so this doesn't work
		// System.out.println(A.d); // private, so this doesn't work
		// We are not inside the same class as that particular static variable
	
		C obj = new C(10, -153, 65, -10);
		System.out.println(obj.w); // public
		System.out.println(obj.x); // protected
		// System.out.println(obj.y); // default
		// System.out.println(obj.z); // private
	}
	
}
