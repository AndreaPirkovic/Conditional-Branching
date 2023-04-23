package pirkovic.andrea;

import java.util.Scanner;

public class Sedmidan {

	public static void main(String[] args) {
		

int dan, mesec, godina, pomocna, dodatak;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan");
		dan = sc.nextInt();
		System.out.println("Unesite mesec");
		mesec = sc.nextInt();
		System.out.println("Unesite godinu");
		godina = sc.nextInt();
		//dan u godini koja nije prestupna u mesecu koji ima 31 dan
				if (dan > 0 && dan <= 24 && mesec % 2 !=0 && 0< mesec && mesec <12 && godina % 4 !=0)
							
				{
					System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
				
					
				else if (dan > 24 && dan < 31 && mesec % 2 !=0 && 0< mesec && mesec <12 && godina % 4 !=0)
					
				{
					pomocna = (31 - dan);
					dodatak = 7 - pomocna;
					dan = dodatak;
					++ mesec;
					System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (dan == 31 && mesec % 2 !=0 && 0< mesec && mesec <12 && godina % 4 !=0)
					{
						dan = 7;
						++ mesec;
						System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));
					}
		//dan u godini koja nije prestupna u mesecu koji ima 30 dana i mesec nije februar
				else if (dan > 0 && dan <= 24 && mesec % 2 == 0 && mesec  != 2 &&  0< mesec && mesec <12 && godina % 4 !=0)
					
				{
					System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
				
					
				else if (dan > 24 && dan < 31 && mesec % 2 ==0 && mesec  != 2 && 0< mesec && mesec <12 &&godina % 4 !=0)
					
				{
					pomocna = (30 - dan);
					dodatak = 7 - pomocna;
					dan = dodatak;
					++ mesec;
					System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (dan == 30 && mesec % 2 ==0 && mesec  != 2 && 0< mesec && mesec <12 &&godina % 4 !=0)
					{
						dan = 7;
						++ mesec;
						System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));
					}
		// godina koja nije prestupna, februar mesec
				else if (godina % 4 !=0 && mesec == 2 && (dan > 0 && dan <= 22))
					
				{System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
					
				else if (godina % 4 !=0 && mesec == 2 && (dan > 22 && dan < 28))
					
				{
					pomocna = (28 - dan);
					dodatak = 7 - pomocna;
					dan = dodatak;
					++ mesec;
					System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (godina % 4 !=0 && mesec == 2 && dan == 28)
					
				{pomocna = (28 - dan);
				dodatak = 7 - pomocna;
				dan = dodatak;
				++ mesec;
				System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
					
		// prestupna godina
				//dan u godini koja je prestupna u mesecu koji ima 31 dan
				else if (dan > 0 && dan <= 24 && mesec % 2 !=0 &&  0< mesec && mesec <12 && godina % 4 ==0)
							
				{
					System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
				
					
				else if (dan > 24 && dan < 31 && mesec % 2 !=0 &&  0< mesec && mesec <12 && godina % 4 ==0)
					
				{
					pomocna = (31 - dan);
					dodatak = 7 - pomocna;
					dan = dodatak;
					++ mesec;
					System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (dan == 31 && mesec % 2 !=0 &&  0< mesec && mesec <12 && godina % 4 ==0)
					{
						dan = 7;
						++ mesec;
						System.out.println("Datum za 7 dana ce biti:" + (dan)+ (".") + mesec + (".") + godina + ("."));
					}
		//dani u godini koja je prestupna u mesecu koji ima 30 dana i mesec nije februar
				else if (dan > 0 && dan <= 24 && mesec % 2 == 0 && mesec  != 2 &&  0< mesec && mesec <12 &&godina % 4 ==0)
					
				{
					System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
				
					
				else if (dan > 24 && dan < 31 && mesec % 2 ==0 && mesec  != 2 && 0< mesec && mesec <12 && godina % 4 ==0)
					
				{
					pomocna = (30 - dan);
					dodatak = 7 - pomocna;
					dan = dodatak;
					++ mesec;
					System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (dan == 30 && mesec % 2 ==0 && mesec  != 2 && 0< mesec && mesec <12 && godina % 4 ==0)
					{
						pomocna = 0;
						System.out.println("Datum za 7 dana ce biti:" + (pomocna + 7)+ (".") + mesec + (".") + godina + ("."));
					}
		// godina koja je prestupna februar mesec
				else if (godina % 4 ==0 && mesec == 2 && (dan > 0 && dan <= 21))
					
				{System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
					
				else if (godina % 4 ==0 && mesec == 2 && (dan > 21 && dan < 29))
					
				{
					pomocna = (29 - dan);
					dodatak = 7 - pomocna;
					dan = 0 + dodatak;
					++ mesec;
					System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (godina % 4 ==0 && mesec == 2 && dan == 29)
					
				{
					
				dan = 7;
				++ mesec;
	
				System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				
				// 12 mesec, decembar
				else if ( mesec == 12 && (dan > 0 && dan <= 24))
						{
										System.out.println("Datum za 7 dana ce biti:" + (dan + 7)+ (".") + mesec + (".") + godina + ("."));	}
				else if (mesec == 12 && (dan > 24 && dan < 31))
				{
				pomocna = (31 - dan);
				dodatak = 7 - pomocna;
				dan = dodatak;
				mesec = 1;
				godina++;
				System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				
				else if (mesec == 12 && dan == 31)
				{
				
				dan = 7;
				mesec = 1;
				godina++;
				System.out.println("Datum za 7 dana ce biti:" + dan + (".") + mesec + (".") + godina + ("."));	}
				}
	}


