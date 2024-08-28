package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex07 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int maior;
		int menor;
		int j=0;
		int resultado=1;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num1>num2) {
			maior=num1;
			menor=num2;
		}
		else {
			maior=num2;
			menor=num1;
		}
		
		for(int i=0; i<maior; i++) {
			if(i!=j) {
				for(int k=maior; k>2; k--) {
					resultado*=(k-1);
					System.out.println(resultado);
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
			j++;
		}
	}
}
