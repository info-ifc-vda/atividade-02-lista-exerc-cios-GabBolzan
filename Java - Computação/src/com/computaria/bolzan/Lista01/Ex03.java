package com.computaria.bolzan.Lista01;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double l1;
		double l2;
		double l3;
		int a1;
		int a2;
		int a3;
		String angulo="";
		String lado="";
		
		System.out.println("Digite o tamanho do lado 1: ");
		l1 = in.nextDouble();
		
		System.out.println("Digite o tamanho do lado 2: ");
		l2 = in.nextDouble();
		
		System.out.println("Digite o tamanho do lado 3: ");
		l3 = in.nextDouble();
		
		System.out.println("Digite o angulo 1: ");
		a1 = in.nextInt();
		
		System.out.println("Digite o angulo 2: ");
		a2 = in.nextInt();
		
		System.out.println("Digite o angulo 3: ");
		a3 = in.nextInt();
		
		if(a1==90 || a2==90 || a3==90) {
			angulo="Retângulo";
		}
		else if(a1>90 && a1<180 || a2>90 && a2<180 || a3>90 && a3<180) {
			angulo="Obtusângulo";
		}
		else if(a1==60 && a2==60 && a3==60) {
			angulo="Equilátero";
		}
		else {
			System.out.println("Digite valores válidos!!!");
		}
		
		if(l1==l2 && l2==l3) {
			lado="Equilátero";
		}
		else if(l1!=l2 && l2!=l3 && l3!=l1) {
			lado="Escaleno";
		}
		else if(l1==l2 || l1==l3 || l2==l3) {
			lado="Isósceles";
		}
		else {
			System.out.println("Digite valores válidos!!!");
		}
		
		System.out.println("Ângulos: "+angulo);
		System.out.println("Lado: "+lado);
		
		in.close();
	}
}
