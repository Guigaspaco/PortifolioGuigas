package PortoSeguro;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leitura = new Scanner (System.in);
float alerta1 = (float) 0.3 , alerta2 = (float) 0.4 , alerta3 = (float) 0.5;
System.out.println("\nInsira o Indice de Poluição Atual:");
float indice = leitura.nextFloat();

if (indice >alerta1 && indice <alerta2) {
	System.out.println("\nEmpresas do 1º Grupo Suspendam suas atividades!!!");
}else if (indice >=alerta2 && indice <alerta3) {
	System.out.println("\nEmpresas do 1º e 2º Grupo Suspendam suas atividades!!!");
	
}else if (indice >=alerta3) {
	System.out.println("\nTodas as empresas do Grupo Suspendam suas atividades!!!");
}else {
	System.out.println("\nIndice dentro do Permitido!!!");
}
	}

}
