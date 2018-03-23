package com.test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2 {
	/*
	 * 使用scanner从键盘读取一行输入，去掉其中重复字符，打印出不同的字符
	 * 
	 * 分析：
	 * 1.创建scanner对象
	 * 2.创建LinkedHashSet对象，将字符存储，去除重复
	 * 3.将字符串转换为字符数组，获取每一个字符HashSet集合中，自动去除重复
	 * 4.遍历Hashset，打印每一个元素
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一行字符串：");
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		String line = scanner.nextLine();
		char[] arr=line.toCharArray();
		for(char c:arr)
		{
			linkedHashSet.add(c);
		}
		for(Character c:linkedHashSet)
		{
			System.out.print(c);
		}
	}
}
