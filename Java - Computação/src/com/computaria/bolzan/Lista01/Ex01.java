package com.computaria.bolzan.Lista01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	    double numHrs;
	    double valorHrs;
	    double salBruto;
	    double imposto;

	    numHrs = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: "));
	    
	    valorHrs = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));

	    salBruto=numHrs*valorHrs;
	    imposto=salBruto*0.3;

	    JOptionPane.showMessageDialog(null, "\nSalário bruto: R$"+salBruto+"\nImposto a pagar: R$"+imposto+"\nSalário a receber: R$"+(salBruto-imposto));

	    in.close();
	}
}
