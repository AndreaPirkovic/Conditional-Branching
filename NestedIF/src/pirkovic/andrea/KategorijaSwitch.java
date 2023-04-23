package pirkovic.andrea;

import java.util.Scanner;

public class KategorijaSwitch {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite kategoriju dozvole");
		int kategorija = sc.next().charAt(0);
		String A ,B ,C ,D ;
		
		switch (kategorija) {
		case 'A' :  {
			System.out.println ("Mozete voziti motor.");
			break;
		}
		case 'B' :  {
			System.out.println ("Mozete voziti auto.");
			break;
		}
				
		case 'C' :  {
			System.out.println ("Mozete voziti auto i autobus.");;
			break;
		}
		case 'D' :  {
			System.out.println ("Mozete voziti auto, kamion i autobus.");
			break;
		}
		
		default:
			System.out.println("Unet neispravan znak");

	}

}
}
