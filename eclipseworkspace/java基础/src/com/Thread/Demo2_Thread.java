package com.Thread;

public class Demo2_Thread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();	//创建Thread类的子类
		myThread.start();					//开启线程
		for (int i = 0; i < 100000; i++) {
			System.out.println("bbbbbbbbbbbb");
		}
	}
}


class MyThread extends Thread{			//继承Thread

	@Override
	public void run() {					//重写run方法
		for (int i = 0; i < 100000; i++) {		//将要被执行的代码写在run方法中
			System.out.println("aaaaaaaaaaaaaaaaaa");
		}
	}		
	
}