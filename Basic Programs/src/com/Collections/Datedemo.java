package com.Collections;
import java.util.Calendar;
import java.util.Date;
class Datedemo{
public static void main(String[] args){ //getInstance() is a factory Method
Calendar c = Calendar.getInstance();
int date = c.get(Calendar.DATE);
int month = c.get(Calendar.MONTH);
int year = c.get(Calendar.YEAR);
System.out.println("Date:" +date+ "/" +(++month)+ "/" +year);
int hour = c.get(Calendar.HOUR);
int minute = c.get(Calendar.MINUTE);
int second = c.get(Calendar.SECOND);
System.out.println("Time =" +hour+ ":" +minute+ ":" +second);
Date d = new Date();
System.out.println("Date:" + d);
          }
   }
