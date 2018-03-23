package com.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {
	/*
	 * 需求：将集合中的重复元素去掉
	 * 
	 * 分析：
	 * 1.创建List集合存储若干个重复元素
	 * 2.单独定义个方法去除重复
	 * 3.打印一下list集合
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("a");
		arrayList.add("a");
		arrayList.add("a");
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("b");
		arrayList.add("b");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("c");
		arrayList.add("c");
		arrayList.add("c");
		arrayList.add("c");
		
		getSingle(arrayList);
		System.out.println(arrayList);
	}

	public static void getSingle(List<String> arrayList) {
		// TODO Auto-generated method stub
		/*
		 * 去除list集合中的重复元素
		 * 1.创建一个LinkedHashset集合
		 * 2.将List集合中所有的元素添加到LinkedHashset集合中
		 * 3.将list集合清空
		 * 4.将LinkedHashset元素添加到list
		 */
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
		linkedHashSet.addAll(arrayList);
		arrayList.clear();
		arrayList.addAll(linkedHashSet);
	}
}
