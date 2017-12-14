import java.util.Scanner;

public class fat {

	public static void main(String[] args) {
		int fat=1,n, i;
		Scanner dados = new Scanner (System.in);
		System.out.print("Numero inferior a 32 :");
		n = dados.nextInt();
		for (i=n; i>=1; i--)
			fat*=i;
		System.out.print("Fatorial de " + n + " = " + fat);
			

	}

}
