package com.inheritance.program;

public class Inheritance_Test1 {
	public static void main(String[] args) {
		
		
		System.out.println("========Parent impl========");
		Parent p = new Parent();
		p.m1();
//		p.m2();// The method m2 is undefind for the type parent 

		System.out.println("======Child impl=======");
		Child c = new Child();
		c.m1();
		c.m2();

		System.out.println("=========Parent-child impl===========");
		Parent p1 = new Child();
		p1.m1();
// 		p1.m2();//The method m2 is undefind for the type parent

//		Child c1 = new Parent();//Type mismatch: cannot convert from Parent to Child
//		c1.m1();
//		c1.m2();
	}
}

class Parent {
	public void m1() {
		System.out.println("Parent m1 method()");
	}

}
class Child extends Parent {

	public void m2() {

		System.out.println("Child m1 method");
	}

}