package com.practice3;

import java.util.Arrays;

public class Morepractice {
	
	public void getrun() {
		int[] a = {50,50,60,60,70};
		
		//System.out.println(a.length);
		for (int i=0;i<a.length;i++) {
			for(int j=(i+1);j<a.length;j++) {
		
		//System.out.println(a[i]);
		//System.out.println(a[j]);
		if(a[i]==a[j]) {
			//System.out.println(a[i]+"====="+a[j]);
			
			System.out.println("my duplicate value="+a[j]);
		}
		
			}
	}
	
}
	public static void main(String[] args) {
		Morepractice obj=new Morepractice();
		obj.getrun();
	}
}