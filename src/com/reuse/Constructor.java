package com.reuse;

public class Constructor {

	public Constructor() {
		System.out.println("default"); // nonpara
		
		}
	public Constructor(String name) {  //para
       this();
       System.out.println(name);
	}
	public Constructor(int age) {
		this("siva");
		System.out.println(age);
    }
	public Constructor(char gender) {
		this(23);
		System.out.println(gender);
		
	}
	public Constructor(float salary) {
		this('f');
		System.out.println(salary);
	}
	public Constructor(long pincode) {
		this(12.3f);
		System.out.println(pincode);
	}
	public static void main(String[]args)throws Throwable {
		Constructor s = new Constructor (345678);
		s.finalize();
	
	}
	
}
