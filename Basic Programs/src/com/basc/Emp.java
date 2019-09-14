package com.basc;
class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
}  
public class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city); 
System.out.println(address.country);
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
  
Emp e=new Emp(111,"varun",address1);  
  
      
e.display();  
 
      
}  
}  