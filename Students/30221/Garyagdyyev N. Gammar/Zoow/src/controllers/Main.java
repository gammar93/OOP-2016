package controllers;

import java.util.Scanner;

import views.Birdsview;
import views.Insectsview;
import views.Mammalsview;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String cev;
		Scanner nr = new Scanner(System.in);
		Scanner ce = new Scanner(System.in);
		System.out.println("Welcome to Zoowsome!");
		do{
		System.out.println("type:\n1: Mammals\n2:  Birds\n3: Insects");
		int key = nr.nextInt();
		switch (key) {
		case 1:
			Mammalsview m = new Mammalsview();
			m.mammalsview();
			break;
		case 2:
			Birdsview b = new Birdsview();
			b.birdsview();
			break;
		case 3:
			Insectsview i = new Insectsview();
			i.insectsview();
			break;
		default:System.out.println("Nu avem alte calse");
		}
		System.out.print("\nVreti sa vedeti alte type(Y,y): ");
		 cev = ce.nextLine();
		}while(cev.equals("Y") || cev.equals("y"));

	}

}
