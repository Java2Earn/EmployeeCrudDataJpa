package com.encapsulation;
class Person //bean class//pojo
{
private int pin=1234;
private String name="xyz";
private String pwd="asdfg";
//setters and getters
public void setPin(int pin) {
	this.pin = pin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}

//encapsulation:wrapping up of data(private data members) and corresponding methods(setters and getters) together
