package com.reuse;

public class Method_overloading {

	public void number(int p) {
		System.out.println(p);
	}
	
	public void number(int q,int a) { // data count differ example
		System.out.println(q+a);
	}
	
	public void number(String s, int a) { //data type differ example
		System.out.println(s+a);
	}
	
	public void number(float f, int a) { // data order differ example
		System.out.println(f+a);
	}
	
	public static void main(String[]args){
		
		Method_overloading s = new Method_overloading();
		
		s.number(4);
		s.number(8, 5);
		s.number("java", 6);
		s.number(0.09f, 2);
		
		
	}
		
	
		
	
	}


