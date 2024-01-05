package com.methodoverriding.program;


class Vehicle{
	 void run() {
		System.out.println("Vehicle is running");
		}
}
public class Bike extends Vehicle{
public static void main(String[] args) {
Bike bobj = new Bike();
bobj.run();

Vehicle v = new Vehicle();
v.run();

Vehicle v1 = new Bike();
v1.run();
}

void run() {
	System.out.println("Bike is running safely");
}

}

