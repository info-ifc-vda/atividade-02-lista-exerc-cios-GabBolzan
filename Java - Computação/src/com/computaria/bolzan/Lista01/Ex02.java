package com.computaria.bolzan.Lista01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    double valSal;
	    double qtdQui;
	    
	    valSal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário minimo: "));

	    qtdQui = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilowatts: "));
	    
	    JOptionPane.showMessageDialog(null, "Valor de cada Quilowatt: R$"+(valSal*0.01)+"\nQuantidade a pagar: R$"+(valSal*0.01*qtdQui));
	    
	    in.close();
	}
}
