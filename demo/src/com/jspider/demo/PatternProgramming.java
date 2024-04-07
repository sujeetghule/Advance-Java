package com.jspider.demo;

public class PatternProgramming {
	public static void main(String[] args) {
		int n = 3;

		for(int i = 0; i<n;i++){
	        for(int j = n ; j<i*2;j--){
	            System.out.print(" ");
	        }
	         for(int j = 0 ; j<i+(2*1)-1;j++){
	            System.out.print("*");
	        }
	         System.out.println();
	    }
	    

		

	}
}
