package com.jspider.demo;

interface A {
	public void demo();

	public void name();
}

interface B extends A {
	public void demo();

}

interface C extends A {
	public void name();

}

class HybridInheritance implements B, C {
	@Override
	public void name() {
		System.out.println("Name");
	}

	@Override
	public void demo() {
		System.out.println("Demo");

	}
	public static void main(String[] args) {

		HybridInheritance hybridInheritance = new HybridInheritance();
		hybridInheritance.name();
		hybridInheritance.demo();
		
	}

	
}
