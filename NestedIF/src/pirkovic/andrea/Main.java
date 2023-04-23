package pirkovic.andrea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// 1 deo algoritma unos podataka
// 2 deo algoritma obrada podataka
// 3 deo algoritma ispisivanje vrednosti
		
		// 1 deo 
		Scanner sc = new Scanner(System.in);
		int najveciBroj;
		System.out.println("Unesite prvi broj:");
		int br1 =  sc.nextInt();
		System.out.println("Unesite drugi broj:");
		int br2= sc.nextInt();
		System.out.println("Unesite treci broj:");
		int br3= sc.nextInt();	
			// 2 deo Obrada podataka
			//
				
		if (br1> br2) // (br1> br2 == true) 
		{
			if (br1 > br3 )// uslov (br1> br3) == true
			{
				najveciBroj= br1;
			}
			else 
			{
				najveciBroj = br3;
			}
		}
		else {
			if (br2 > br3)
			{
				najveciBroj= br2;
							}
			else {
				najveciBroj= br3;
				System.out.println("Najveci broj je: " + najveciBroj);
			}
		}
		
		
	
	}
		
	}

