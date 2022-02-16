package PortoSeguro;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		System.out.println("Base:______");
		float b = leitor.nextFloat();  
		System.out.println("Altura:______");
		float h = leitor.nextFloat();
		
		if(b >0 && h >0) {
			System.out.println("Àrea do Triangulo:______");
			System.out.println((b*h)/2);
		}
		

	}

}


