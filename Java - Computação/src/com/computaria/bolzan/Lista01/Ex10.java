package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String[] args) {
		int num[] = new int[10];
		int qntPrimos=0;
		boolean primo;
		
		for(int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" número: "));
			
			primo=true;
			
			for(int j=3; j<=num[i]; j++) {
				if(num[i]%(j-1)==0) {
					primo=false;
				}
			}
			
			if(num[i]==0 || num[i]==1) {
				primo=false;
			}
			
			if(primo==true) {
				qntPrimos++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Foram digitados "+qntPrimos+" números primos!");
	}
}
