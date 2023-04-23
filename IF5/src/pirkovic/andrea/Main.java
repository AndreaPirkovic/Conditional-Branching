package pirkovic.andrea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ispitati da li je broj pozitivan egatrivan  ili jednak 0
		Scanner sc = new Scanner (System.in);
		
		int broj;
		System.out.println("Unesite vrednost za broj:");
	broj = sc.nextInt();
		if (broj > 0)
	{
		System.out.println("Broj je pozitivan");
	}
		else if  (broj < 0)
		{
			System.out.println("Broj je negativan");
		}
		else if (broj == 0)
		{
			System.out.println("Uneti broj je nula");}
		else
		{
			System.out.println("Pogresan unos");
			
		}
	}
	}


