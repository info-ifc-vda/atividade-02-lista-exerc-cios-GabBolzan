package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex06 {
	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		int resultado=num;
		
		if(resultado==0) {
			resultado=1;
		}
		
		for(int i=num; i>2; i--) {
			resultado*=(i-1);
		}
		
		JOptionPane.showMessageDialog(null, "Fatorial de "+num+" é: "+resultado);
	}
}
