import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("������� 3 �����. ������� ����� ����� ��������� ax^2+bx+c=0 ��� ��������� � ���, ��� ������ ���");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (b*b - (4*a*c) < 0)
			System.out.println("������ ���");
		else
		{
			if (b*b - (4*a*c) == 0)
				System.out.println("�����: " + (-b/(2*a)));
			else
			{
				System.out.println("����� 1: " + ((-b + Math.sqrt(b*b - (4*a*c)))/(2*a)));
				System.out.println("����� 2: " + ((-b - Math.sqrt(b*b - (4*a*c)))/(2*a)));
			}
		}
		scan.close();
	}
}
