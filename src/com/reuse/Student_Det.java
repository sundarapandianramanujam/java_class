package com.reuse;

public class Student_Det extends Student_Details {

	@Override
	void name() {
		System.out.println("name");
		
	}

	@Override
	void school() {
		System.out.println("school");
		
	}

	@Override
	void college() {
		System.out.println("college");
		
	}

	public static void main(String[]args) {
		Student_Det rs = new Student_Det();
		rs.name();
		rs.school();
		rs.college();
		
		
	}
		

	}


