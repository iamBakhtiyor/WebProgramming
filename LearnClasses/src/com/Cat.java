package com;

public class Cat {

	private String name;
	private String sex;
	private String color;
	private int age;
	
	public static void meow() {
		System.out.println("���");
	}
	public void init(String name, String sex, String color, int age) {
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.age = age;
		System.out.println("� �������!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		if (sex == "���")
			return "� ��� � ���� ����� " + name;
		else
			return "� ����� � ���� ����� " + name;
	}
}
