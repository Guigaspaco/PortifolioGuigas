package PortoSeguro;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int n;
		System.out.println("\nDigite um número:");
		n = leia.nextInt();
		if (n % 2 ==0) {
			System.out.println("\nEsse número é par !!!");
			}else {
				System.out.println("\nEsse número é impar !!!");
			}
		if (n >= 0) {
			System.out.println("\nEsse numero é positivo !!!");
		}
			else {
				System.out.println("\nEsse número é negativo !!!");
			}
			}
		}
