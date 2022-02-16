package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nome;//esto criando uma variavel do tipo String
	int idade=26, x,y;
	float altura;
	double nota1,nota2,nota3,media;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	Scanner leia = new Scanner(System.in);//estou criando a entrade de dados
	
	System.out.println("Olá Mundo !!!");
	
	System.out.println("\n\t\tEntre com o seu nome:");//estou criando uma saida de dados
	nome = leia.nextLine();//estou pegando a entrado do me usuario 
	System.out.println("\n\t\tEntre com a sua altura:");
	altura = leia.nextFloat();
	System.out.println ("\nEntre com a sua primeira nota: ");
	nota1=leia.nextFloat();
	System.out.println("\nEntre com a sua segunda nota:");
	nota2 = leia.nextFloat();
	System.out.println("\nEntre com a sua terceira nota:");
	nota3 = leia.nextFloat();
	
	media = (nota1+nota2+nota3) / 3; // 7,8
	
	if(media >=7 && media <=10)
	{	
		System.out.println("\nAluno aprovado !!!");
	}
	else if(media >=5 && media<7)
	{
		System.out.println("\nAluno de exame !!!");
	}	
	else if (media>=0 && media<5)
	{
		System.out.println("\nAluno reprovado !!!");
	}
	else
	{
		System.out.println("\nMedia Inválida !!!");
	}
	System.out.println("\nMeu nome é: "+nome+" eu tenho: "+idade+
			" ano(s) e a minha altura é: "+altura);
	
	System.out.printf("\nMedia aritmética: %2.2f",media);
	
	nota1 = Math.sqrt(nota2); // raiz quadrada
	nota2 = Math.pow(nota3, 3); // potencia
	
	System.out.println ("\nEntre com o valor de x :");
	x = leia. nextInt();
	System.out.println ("\nEntre com o valor de y :");
	y = leia. nextInt();
	
	x = x % y; // calcula o resto da divisao de dois numeros inteiros
	
	}

}
