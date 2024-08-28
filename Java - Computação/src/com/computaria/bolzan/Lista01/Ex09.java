package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex09 {
	public static void main(String[] args) {
		int num;
		boolean primo=true;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		for(int i=3; i<=num; i++) {
			if(num%(i-1)==0) {
				primo=false;
			}
		}
		
		if(num==0 || num==1) {
			primo=false;
		}
		
		if(primo==true) {
			JOptionPane.showMessageDialog(null, num+" é primo!");
		}
		else {
			JOptionPane.showMessageDialog(null, num+" não é primo!");
		}
	}
}
