package pirkovic.andrea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// za uneti broj ispitati da li je deljiv sa brojem 2 ili 3
		
	
				Scanner input = new Scanner(System.in);
				System.out.print("Unesite vrednost za broj: "); 
				int broj = input.nextInt();
				
				if (broj % 2 == 0 && broj % 3 == 0 ) 
				{	
				System.out.println("broj je deljiv i sa 3 i 6sa 2 "); 
				}
				
				
				input.close(); 
				} 
	

	}


