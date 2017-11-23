package uyhgtyiv;

import java.util.Scanner;

public class NewClass {// inicio

	public static void main(String[] args) {// main
		Scanner Ler = new Scanner(System.in);
		double numero1;
		double numero2;
		double resultado = 0;
		String operador;
		System.out.print("Qual o numero 1?");
		numero1 = Ler.nextDouble();
		System.out.print("Digite o numero 2?");
		numero2 = Ler.nextDouble();
		System.out.print("Qual o operado?");
		operador = Ler.next();
		switch (operador) {
		case "+":	resultado = numero1 + numero2;
		break;
		case "-":	resultado = numero1 - numero2;
		break;
		case "*":	resultado = numero1 * numero2;
		break;
		case "/":	resultado = numero1 / numero2;
		break;

		}
		System.out.print("O resultado é: " + resultado);

	}// main
}// end
