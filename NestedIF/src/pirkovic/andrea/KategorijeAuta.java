package pirkovic.andrea;

import java.util.Scanner;

public class KategorijeAuta {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite kategoriju dozvole");
		int kategorija = sc.next().charAt(0);
		String A ,B ,C ,D ;
		
		if (kategorija == 'A' ) 
		{
			System.out.println ("Mozete voziti motor.");
		}
		else if (kategorija == 'B' )
			{
				System.out.println ("Mozete voziti auto.");
			}
		else if (kategorija == 'C' )
			{
				System.out.println ("Mozete voziti auto i kamion.");
			}
		else if  ( kategorija == 'D' )
		
			{
			System.out.println ("Mozete voziti auto, autobus i kamion.");
							}
			else {
				System.out.println ("Neispravan unos");
			}
	}
}
	
	
		
		
	
	
		
	

