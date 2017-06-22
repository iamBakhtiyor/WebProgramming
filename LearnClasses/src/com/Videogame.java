package com;

public class Videogame {

	private String name;
	private int year;
	private String genre;
	private String developer;
	private String publisher;
	private int playersnum;
	private String esbrRating;
	private double mcScore;
	
	
	public void init(String name, int year, String genre, String developer, String publisher, int playersnum, String esbrRating, double mcScore) {
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.developer = developer;
		this.publisher = publisher;
		this.playersnum = playersnum;
		this.esbrRating = esbrRating;
		this.mcScore = mcScore;
		System.out.println("���� " + name + " ���������\n");
	}

	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getInformation() {
		System.out.println("��������: " + name);
		System.out.println("��� �������: " + year);
		System.out.println("����: " + genre);
		System.out.println("�����������: " + developer);
		System.out.println("��������: " + publisher);
		System.out.println("�����������: " + (playersnum > 1 ? "����" : "���"));
		System.out.println("���������� �������: " + esbrRating);
		System.out.println("������� ���� �� Metascore: " + mcScore);
	}
	
}
