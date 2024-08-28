package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		int cod;
		int qtd;
		double valUni=0;
		double total;
		double desconto=0;
		double valFinal;
		
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto (1 a 40): "));
		
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada: "));
		
		if(cod>=1 && cod<=10) {
			valUni=10;
		}
		else if(cod>=11 && cod<=20) {
			valUni=15;
		}
		else if(cod>=21 && cod<=30) {
			valUni=20;
		}
		else if(cod>=21 && cod<=40) {
			valUni=40;
		}
		else {
			JOptionPane.showMessageDialog(null, "Digite um código válido!!!");
		}
		
		total=valUni*qtd;
		
		if(total<=250) {
			desconto=total*0.05;
		}
		else if(total>250 && total<=500) {
			desconto=total*0.10;
		}
		else if(total>500) {
			desconto=total*0.15;
		}
		
		valFinal=total-desconto;
		
		JOptionPane.showMessageDialog(null, "Valor unitário: R$"+valUni+"\n"
				+ "Valor total: R$"+total+"\n"
						+ "Valor do desconto: R$"+desconto+"\n"
								+ "Valor final com o desconto: R$"+valFinal);
	}
}
