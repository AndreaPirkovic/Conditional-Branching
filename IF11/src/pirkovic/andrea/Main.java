package pirkovic.andrea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int poeni;
		System.out.println("Unesite vrednost poena:");
	poeni = sc.nextInt();
		if (poeni  >= 0 && poeni <= 49)
	{
		System.out.println("Ocena 1");
	}
		else if  (poeni>= 50 && poeni <= 60)
		{
			System.out.println("Ocena 2");
		}
		else if (poeni>= 61 && poeni <= 69)
		{
			System.out.println("Ocena 3");}
		
		else if (poeni>= 70 && poeni <= 80)
		{
			System.out.println("Ocena 4");}
		else if (poeni>= 81 && poeni <= 100)
		{
			System.out.println("Ocena 5");}
		else
		{
			System.out.println("Greska");
			
		}
	}
	}


