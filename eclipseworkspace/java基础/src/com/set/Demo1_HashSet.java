package com.set;

import java.util.HashSet;

import com.bean.Person;
import com.bean.Student;

public class Demo1_HashSet {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<>();
		hSet.add(new Person("张三",23));
		hSet.add(new Person("张三",23));
		hSet.add(new Person("张三",23));
		hSet.add(new Person("李四",24));
		System.out.println(hSet);
		
		HashSet<Integer> hashSet= new HashSet<>();
		hashSet.add(1);
		hashSet.add(121);
		hashSet.add(112);
		hashSet.add(14334);
		hashSet.add(0);
		System.out.println(hashSet);
	}

	private static void demo1() {
		HashSet<String> hSet = new HashSet<>();
		hSet.add("a");
		boolean b1=hSet.add("a");
		hSet.add("b");
		hSet.add("d");
		hSet.add("c");
		
		for(String string:hSet)					//只要能用迭代器迭代的，就能后使用增强for循环
		{
			System.out.println(string);
		}
	}
}
