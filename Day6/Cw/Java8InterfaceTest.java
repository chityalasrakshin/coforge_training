package com.coforge.day6;

interface MyInterface {
	default void myMethod1() {
		System.out.println("Default Method");
	}
	
	void myMethod2();
	
	static void myMethod3() {
		System.out.println("Static Method");
	}
}

public class Java8InterfaceTest implements MyInterface {

	public static void main(String[] args) {
		Java8InterfaceTest interfaceExample = new Java8InterfaceTest();

		// Note: default methods can be called through the object.
		interfaceExample.myMethod1();

		// Note: abstract methods must be implemented by the class.
		interfaceExample.myMethod2();

		// Note: static interface methods are called with the interface name.
		MyInterface.myMethod3();
	}

	@Override
	public void myMethod2() {
		System.out.println("Abstract Method Implementation");
	}
	
	// Note: a default method can be overridden for custom behavior.
	@Override
	public void myMethod1() {
		System.out.println("Overridden Default Method");
	}

}
