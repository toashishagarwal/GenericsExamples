package com.demo.generics;

public class RunProgram {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
		integerBox.set(23);
		
		System.out.println(integerBox.get());
		
		Box<String> stringBox = new Box<>();
		stringBox.set("String");
		
		System.out.println(stringBox.get());
		
		// This is a compilation problem bcoz inspect() method expects anything that extends a Number 
		// and here we pass String
		// integerBox.inspect("Test my string"); 
		
		integerBox.inspect(10);
	}

}
