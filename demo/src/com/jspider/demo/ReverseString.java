package com.jspider.demo;

public class ReverseString {

	
	public static int Method() {
		int ans = 0;
		
		for(int i=1;i<51;i++) {
			if(i%3==0&&i%7==0) {
				System.out.println(i);
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(Method());
		
	}
}
