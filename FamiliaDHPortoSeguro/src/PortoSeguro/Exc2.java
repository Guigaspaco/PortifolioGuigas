package PortoSeguro;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio
		//E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule 
		//o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho 
		//vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio excedente.
		
		Scanner leia = new Scanner(System.in);
		int c, n, e;
		
		int salarioAtual, salarioExcedente;
		
		System.out.println("\nDigite seu c�digo:");
		
		c = leia.nextInt();
		
		System.out.println("\nDigite as horas trabalhadas: ");
		n = leia.nextInt();
		
if(n>50) {
	e=n - 50;
	salarioAtual = n * 10;
	salarioExcedente = (e * 20) + salarioAtual;
	
	System.out.println("Salario atual: " + salarioAtual + " reais");
	System.out.println("Salario excedente: " + salarioExcedente + " reais");
}
else {
	salarioAtual = n * 10;
	salarioExcedente = 0;
	System.out.println("Sal�rio atual: " + salarioAtual + " reais");
	System.out.println("Sal�rio excedente: " + salarioExcedente + " reais");
}
}

	}


