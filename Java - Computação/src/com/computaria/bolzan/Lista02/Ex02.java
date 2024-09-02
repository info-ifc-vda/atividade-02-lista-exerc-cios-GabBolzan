package com.computaria.bolzan.Lista02;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		int vetor1[]=new int[10];
        int vetor2[]=new int[10];
        int vetor3[]=new int[20];
        int j=0;
        String dif="";

        for (int i=0;i<5;i++) {
            vetor1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + (i + 1) + " do vetor 1: "));
        }

        for (int i=0;i<5;i++) {
            vetor2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + (i + 1) + " do vetor 2: "));
        }

        for (int i=0;i<10;i++) {
            int k;
            for (k=0;k<10;k++) {
                if (vetor1[i]==vetor2[k]) {
                    break;
                }
            }
            if (k==10) {
                vetor3[j]=vetor1[i];
                j++;
            }
        }

        for (int i=0;i<10;i++) {
            int k;
            for (k=0;k<10;k++) {
                if (vetor2[i] == vetor1[k]) {
                    break;
                }
            }
            if (k==10) {
                vetor3[j]=vetor2[i];
                j++;
            }
        }

        for (int i=0;i<j;i++) {
            dif+=vetor3[i]+"  ";
        }

        JOptionPane.showMessageDialog(null, "Números não comuns entre os vetores: "+dif);
	}
}
