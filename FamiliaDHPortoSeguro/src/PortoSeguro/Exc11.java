package PortoSeguro;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, menos21=0, mais50=0;
		Scanner leia = new Scanner(System.in);
		while (idade<=98) {
			System.out.println("\nDigite a sua idade:");
			idade = leia.nextInt();
		
			
			if(idade<=21 && idade >0) {
				menos21++;
			}else if (idade> 50) {
				mais50++;
			}
		}
		
	System.out.println("\nTotal de Pessoas com menos ou até 21 anos é :"+menos21);
	System.out.println("\nTotal de Pessoas com mais ou até 50 anos é :"+mais50);
	
	}
}

