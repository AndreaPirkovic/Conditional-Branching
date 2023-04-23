package pirkovic.andrea;
import java.util.Scanner;
public class Main {
// za uneti broj ispitati da li je broj pozitivan, negativan ili jedank 0.

// 1. deo unos podataka tj uocavanje potrebnih ulaznih podataka
	Scanner sc = new Scanner (System.in);
	{
	int broj; 
	
	System.out.println("Unesite vrednost za broj:");
			broj = sc.nextInt();
// 2.deo algoritma obrada podataka
			if (broj >0)
 {
	 System.out.println("broj je pozitivan");
 }
			if (broj <0)	 {
		 System.out.println("Broj je negativan");
	 }
			if ( broj == 0)	 {
		 System.out.println("Uneti broj je nuuuula");
	 }
	 sc.close(); 
 }
}
// x= 10; naredba dodele
