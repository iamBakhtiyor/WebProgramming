package com;

public class Computer {
	private String name;
	private int year;
	
	public int getYear() {
		return year;
	}
	public void init(String name, int year) {
		this.name = name;
		this.year = year;
		System.out.println("��������� ��������\n");
	}
	public void potyanet(Videogame game) {
		int y = game.getYear();
		System.out.println(y-year-5<0?("���� " + game.getName() + " ������ �� ���������� " + name ):("���� " + game.getName() + " �� ������ �� ���������� " + name ));
	}
}
