package Temperaturas;
import java.util.Scanner;
public class Temperatura_F_C {
	public static void main(String[] args) throws Exception
	{double C, F;
	System.out.print("Temperaturas em graus Fahrenheit?");
	Scanner LerS = new Scanner(System.in);
	F=LerS.nextDouble();
	C=(F-32)/1.8;
	System.out.printf(String.format("%3.1f graus Fahrenheit =%3.1f graus Celsius", F,C));}}
	
