package com.method;

public class Demo6_Yield {
	/*
	 * 礼让线程，yield让出cpu
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread().start();
		new MyThread().start();
	}

}


class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if(i%10==0)
			{
				Thread.yield(); 					//让出cpu
			}
			System.out.println(getName()+" ......."+i);
			
		}
	}
}