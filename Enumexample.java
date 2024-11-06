package com.anudip.adv;



public class Enumexample {
	enum Course{
		Java,
		Python,
		AWS,
		DANLC
		
	}

	public static void main(String[] args) {
        Course c=Course.AWS;
        System.out.println(c.name());
        System.out.println(c.ordinal());
		
	}

}
