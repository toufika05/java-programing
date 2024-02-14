package com.theone.toufika;

class MainOverload{
	public static void main(String[] args) {
		System.out.println("String[] args executed");/////jvm always call main method where string[] arguments declared
		main(new int[0]);
		main(new char[0]);
	}
	public static void main(int[] args) {
		System.out.println("int[] args executed");	
	}

	public static void main(char[] args) {
		System.out.println("char[] args executeds");
		
	}
}
