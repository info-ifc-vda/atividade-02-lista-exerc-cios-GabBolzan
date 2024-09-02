package com.computaria.bolzan.Lista02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=0;
		int cubo[] = new int[1000];
		int vetor[] = new int[1000];
		double raiz[] = new double[1000];
		
		for(;;) {
			System.out.println("Digite um número: ");
			vetor[i] = Integer.parseInt(in.nextLine());
			
			cubo[i]=(int)Math.pow(vetor[i], 3);
			raiz[i]=Math.sqrt(vetor[i]);
			
			for(int j=0; j<=i; j++) {
				if(j==0 && vetor[j]>0 || j%20==0 && vetor[j]>0) {
					System.out.println("\nNúmero | Cubo | Raiz");
				}
				
				if(vetor[i]>0) {
					System.out.println(vetor[j]+" | "+cubo[j]+" | "+raiz[j]);
				}
			}
			
			if(vetor[i]<=0) {
				break;
			}
			
			i++;
		}

		System.out.println("Programa finalizado!");
	}
}
