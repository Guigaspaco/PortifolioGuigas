package PortoSeguro;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Desenvolva um sistema em que:
//		eia 4 (quatro) n�meros;
	//	alcule o quadrado de cada um;
	// Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	//Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
Scanner leia = new Scanner(System.in);
double n1,n2,n3,n4;

System.out.println("\nDigite o primeiro n�mero:");
n1 = leia.nextInt();

System.out.println("\nDigite o segundo n�mero:");
n2 = leia.nextInt();

System.out.println("\nDigite o terceiro n�mero:");
n3 = leia.nextInt();

System.out.println("\nDigite o quarto n�mero:");
n4 = leia.nextInt();

n1 = Math.pow(n1, 2);
n2 = Math.pow(n2, 2);
n3 = Math.pow(n3, 2);
n4 = Math.pow(n4, 2);

if (n3 >= 1000) {
	System.out.println("\nO valor do terceiro n�mero � maior ou igual a 1000, seu valor � : " +n3);
}
else {
	System.out.printf("O valor do primeiro n�mero �: %.0f", n1);
	System.out.printf("\nO valor do segundo n�mero �: %.0f", n2);
	System.out.printf("\nO valor do terceiro n�mero �: %.0f", n3);
	System.out.printf("\nO valor do quarto n�mero �: %.0f", n4);
	}
}
}
