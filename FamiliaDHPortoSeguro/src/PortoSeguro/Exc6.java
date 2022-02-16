package PortoSeguro;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a idade:");
		int idade = leia.nextInt();
		
		if (idade >=5 && idade <=7) {
		 	System.out.println("\nNadador Pertence a categoria Infantil A !!!");
		}else if ( idade >=8 && idade <=11 ) {
		System.out.println("\nNadador Pertence a categoria Infantil B !!!");
		}else if ( idade >=12 && idade <=13 ) {
		System.out.println("\nNadador Pertence a categoria Juvenil A!!!");
        }else if ( idade >=14 && idade <=17 ) {
        System.out.println("\nNadador Pertence a categoria Juvenil B!!!");
        }else if ( idade >=18 ) {
        System.out.println("\nNadador Pertence a categotia Adultos !!!");
        }else {
        System.out.println("\nIdade não permitida!!!");
        	}
}
}


