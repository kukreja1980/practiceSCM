package Basics;

public class Car {
private String make;
private String model;
private int speed=12;

public Car() {
	System.out.println("Hello without arguments");
	this.make="Make_without";
}

public Car(String make) {
	System.out.println("Hello with arguments");
	this.make="Make_with";
}

public int increaseSpeed(int speed) {
	speed=this.speed+speed;
	return speed;
}

public void setMake(String make) {
	this.make = make;
}
public String getMake() {
	return this.make;
}
public String getModel() {
	return this.model;
}
public void setModel(String model) {
	this.model = model;
}
public void setoSpeed(int speed) {
	this.speed = speed;
}
public int getSpeed() {
	return this.speed;
}
}
