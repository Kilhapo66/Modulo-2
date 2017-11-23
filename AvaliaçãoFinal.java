
package psii;
import java.util.Scanner;
public class AvaliaçãoFinal {//start
    public static void main(String[] args) {//main
        Scanner Ler = new Scanner(System.in);
    double numero1;
    double numero2;
    double resultante;
    String nome;
        System.out.print("Qual o nome do aluno?");
        nome = Ler.next();
        System.out.print("Digite a nota Cognitiva do aluno.");
        numero1 = Ler.nextDouble();
        System.out.print("Digite a notaAtitudial do aluno.");
        numero2 = Ler.nextDouble();
    resultante = (0.6*numero1)+(0.4*numero2);
        System.out.print("O resultado é " + resultante);
    if (resultante>=10)
        System.out.print("O aluno passou.");
        else 
        System.out.print("O aluno reprovou.");
        System.out.print("O resultado do aluno:" + nome + "com" + resultante);
        
        
        
        
        
    }//main
    
}//end
