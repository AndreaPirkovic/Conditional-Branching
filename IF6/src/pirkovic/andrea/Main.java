package pirkovic.andrea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ispitati da li je znak veliko,malo slovo,cifra ili specijalni znak
		Scanner sc = new Scanner(System.in); 
		System.out.print("Unesite SAMO jedan znak .... ");
		char znak = sc.next().charAt(0); 
		if ( znak >= 'A' && znak <= 'Z') 
		{ 	System.out.println("Uneti znak " + znak + " je veliko slovo."); }
		
		else if ( znak >= 'a' && znak <= 'z') { 	System.out.println("Uneti znak " + znak + " je malo slovo."); } 
		else if (znak >= '0' && znak <='9')
		//else if ( znak +1 > znak ) 
		{ System.out.println("Uneti znak je cifra."); }  
		else 
		{
			System.out.println( "Uneti karakter je specijalni simbol");
		
		}
		}
	
		} 



