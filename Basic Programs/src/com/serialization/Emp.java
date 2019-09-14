package com.serialization;
import java.io.Serializable;
public class Emp implements Serializable
{
private int id;
private String name;
transient private int atmpin;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAtmpin() {
	return atmpin;
}
public void setAtmpin(int atmpin) {
	this.atmpin = atmpin;
}}