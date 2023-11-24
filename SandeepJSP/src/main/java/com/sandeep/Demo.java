package com.sandeep;

public class Demo {
	
	int id;
	void sand() {
		System.out.println(id);
		id=1000;
	}

	void sa() {
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.sand();
		d.sa();
	}
}
