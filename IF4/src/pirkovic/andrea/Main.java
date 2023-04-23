package pirkovic.andrea;

import java.util.Scanner;

public class Main {
	// ispitati da li je broj paran
	public static void main(String[] args) {
		/* Ispitati da li je broj paran. */ 
		int broj; 
		Scanner sc1 = new Scanner(System.in); System.out.println("Unesite broj: "); 
		broj = sc1.nextInt(); 
		/* Razgranata struktura */ 
		if (broj % 2 == 0) System.out.println("Broj je paran."); 
		else System.out.println("Broj nije paran."); } 
}