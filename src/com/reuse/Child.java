package com.reuse;

public class Child extends Parents{
	

	public void marriage() {
		System.out.println("my marriage my rules");
		
}
	public static void main(String[]args) {
		
		Parents os = new Child();
		
		os.properties();
		os.marriage();
		
		
		
		
		
	}

}
