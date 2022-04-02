package com.jbt;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		    1.Java source file name mismatch (class and source file mismatch)
			2.Improper casing
	        3.Mismatched brackets
			4.Missing semicolons
			5.Method is undefined
			6.Variable already defined
			7.Variable not initialized
			8.Type mismatch: cannot convert
			9.Return type required
			10.Unreachable code
		 */
		//Improper casing
		int x = 10;
		System.out.println(x);
		int y;
		System.out.println(y);
	}
		//An interface is like having a 100% Abstract Class. 
		//Interfaces can not have non-abstract Methods while abstract Classes can. 
		//A Class can implement more than one Interface while it can extend only one Class. 
		//As abstract Classes comes in the hierarchy of Classes, 
		//they can extend other Classes while Interface can only extend Interfaces.
		//Let's say HelloWorld is a class this would not work.

		public interface Interface_JAVA8 extends class HelloWorld { //this would not work

			public voil method(); //needs to say void not voil

			public abstract void method1();

			public default void method2() {
			}

			public static void method3() {
			}
		}
		
}
