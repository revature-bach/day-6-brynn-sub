package com.revature;

public class A {

	// instance fields
	public int w;
	protected int x;
	int y;
	private int z;
	
	// static fields
	public static int a;
	protected static int b;
	static int c;
	private static int d;
	// If you declare fields and don't assign a value, they have
	// what are known as "default values"
	// for numbers these would be 0
	// for booleans this would be false
	// for reference variables this would be null
	// Side note: variables locally defined inside a method DO NOT
	// have default values
	
	public A(int w, int x, int y, int z) {
		// super() <- the compiler actually automatically inserts a super()
		// if we don't have the super invocation manually
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void main(String[] args) {	
		A obj1 = new A(10, 15, 0, 40);
		
		// w, x, y, z are instance fields
		// every object has their own instance fields that can take on different values
		// So here we access the instance fields using the obj1 reference that is pointing
		// to an A object we just constructed
		System.out.println(obj1.w);
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.z);
		
		A obj2 = new A(-1, -2, -3, -4);
		System.out.println(obj2.w);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.z);
		
		// a, b, c, d are static fields
		// We can access them directly from the class itself
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
		System.out.println(A.d);
	}
}
