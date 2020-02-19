package com.Threads;
class Number {
	public int n;
	boolean value = false;
	synchronized void even(int n)//2
	{		if (!value) {
try {wait();} catch (InterruptedException e) {e.printStackTrace();}}
		this.n = n;//2
		System.out.println(n);//1,2
		value = false;
		notify();}
	synchronized void odd(int n)//1,3
	{	if (value) {
	try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		this.n = n;//1
		System.out.println(n);//1
		value = true;
		notify();}}
class Odd implements Runnable {
	Number num;
	Odd(Number num) {
		this.num = num;
		new Thread(this, "odd").start();}
	public void run() {
		for (int i = 1; i <= 100; i = i + 2) {
			num.odd(i);		}}}
class Even implements Runnable {
	Number num;//has-a
	Even(Number num) {
		this.num = num;
		new Thread(this, "even").start();
	
	}
	public void run() {
		for (int i = 2; i <= 100; i = i + 2) {
			num.even(i);}}}
public class ThreadInter1 {
	public static void main(String[] args) {
		Number number = new Number();
		Even e = new Even(number);
		Odd d = new Odd(number);}}