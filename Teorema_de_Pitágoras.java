package Teoremas;

import java.util.Scanner;

public class Teorema_de_Pitágoras {

	public static void main(String[] args)  {
		double C1,C2, H;
		System.out.print("Medida de um cateto ? ");
		 Scanner lerS = new Scanner(System.in);
		C1= lerS.nextDouble();
		System.out.print("Medida do outro cateto? ");
		C2= lerS.nextDouble();
		H=Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));
		System.out.printf("Hipotenusa= " + H);
		}
	}

		
	

	


