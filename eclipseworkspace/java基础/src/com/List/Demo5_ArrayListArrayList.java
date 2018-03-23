package com.List;

import java.util.ArrayList;

import com.bean.Student;

public class Demo5_ArrayListArrayList {
	//案例：我们学科，学科又分为若干个班级，整个学科是一个大集合，若干个班级分为每一个小集合
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>>  list = new ArrayList<>();
		ArrayList<Student> first = new ArrayList<>();//创建第一个班级
		first.add(new Student("张三", 24));
		first.add(new Student("张四", 34));
		first.add(new Student("张物", 44));
		
		ArrayList<Student> second = new ArrayList<>();//创建第二个班级
		second.add(new Student("小明",31));
		second.add(new Student("大明",32));
		second.add(new Student("中明",33));
		//将班级添加道学科集合中
		list.add(first);
		list.add(second);
		
		//遍历学科集合
		for(ArrayList<Student> a:list)
		{
			for(Student b:a)
			{
					System.out.println(b);
			}
		}

	}
}
