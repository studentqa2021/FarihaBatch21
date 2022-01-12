package com.testrun2;

import java.util.Arrays;

public class Functional {
	int a=10;
	int[] b= {10,20,30};
	String c=("UNITED STATES");
	double f=50.60;

	public void getmajic() {
		
		
		System.out.println(Arrays.toString(b));/// to print whole array
		System.out.println(b[0]);
		System.out.println(b[1]);// to print individual value
		System.out.println(b[2]);
		System.out.println(b.length);// to count total no of vale variable contain
		System.out.println("My array total no is="+b.length);
		System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		}
	
	
	
	
	public static void main(String[] args) {
		
		Functional obj=new Functional();
		obj.getmajic();
	}

}
