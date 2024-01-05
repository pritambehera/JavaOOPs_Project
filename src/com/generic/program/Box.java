package com.generic.program;

public class Box<T> {
private T t;
public void add(T t) {
	this.t =t;
}
public T get() {
	return t;
}
public static void main(String[] args) {
	Box<String> b1 = new Box<>();
	b1.add("Pritam");
	System.out.println(""+b1.get());
	
}
}
