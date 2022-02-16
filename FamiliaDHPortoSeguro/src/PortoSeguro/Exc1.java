package PortoSeguro;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double peso, excesso, multa;

try (Scanner leia = new Scanner(System.in)) {
	System.out.println("\nEntre com o peso dos tomates:");
	peso = leia.nextDouble();
}

if(peso <= 50) {
	System.out.println("\nPeso dos tomates dentro do kg permitido: " +peso);
	excesso = 0;
	System.out.println("\nPeso excedente dos tomates é: " +excesso);
	multa = 0;
	System.out.println("\nMulta a ser paga é:" +multa);
}
else {
    System.out.printf("\nPeso dos tomates acima do kg permitido: %3.3f", peso);
    peso = Math.ceil(peso);
    excesso = peso - 50;
    System.out.println("\nPeso excedente dos tomates é: " +excesso);
    multa = 4 * excesso;
    System.out.println("\nMulta a ser paga é:"+multa);
	}

	}
}



