package sec02.test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		int n;
		while(run) {
			System.out.println("\n----------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------------------");
			System.out.print("����> ");
			n=Integer.parseInt(scanner.nextLine());
			switch(n) {
			case 1:
				System.out.print("���ݾ�>");
				balance+=Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�>");
				balance-=Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("�ܰ�>"+balance+"\n");
				break;
			case 4:
				run=false;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
