package com.firstapp.servlet;

public class Hello6 {

	public static void main(String[] args) {
		System.out.println("hello6 main method starts.");

	}
	
	
	void printMessage(){
		System.out.println("just printing hello message.");
		display();
	}
	
	static void display(){
		System.out.println("display method.");
	}
	
	static void greeting(){
		System.out.println("this is greeting method.");
	}

}
