package com.computaria.bolzan.Lista02;

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String[] args) {
		int vetor1[] = new int[10];
        int vetor2[] = new int[5];
        int vetorResultado1[] = new int[10];
        int vetorResultado2[] = new int[10];

        for (int i=0; i<10; i++) {
            vetor1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição "+(i+1)+" do vetor 1: "));
        }

        for (int i = 0; i < 5; i++) {
            vetor2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição "+(i+1)+" do vetor 2: "));
        }

        for (int i = 0; i<10; i++) {
            if (vetor1[i]%2==0) {
                int soma=0;
                
                for (int j=0; j<5 ;j++) {
                    soma+=vetor2[j];
                }
                
                vetorResultado1[i]=vetor1[i]+soma;
            } else {
                vetorResultado1[i]=0;
            }
        }

        for (int i=0;i<10;i++) {
            if (vetor1[i]%2!=0) {
                int qtdDivisores=0;
                
                for (int j=0; j<5; j++) {
                    if (vetor1[i]%vetor2[j]==0) {
                        qtdDivisores++;
                    }
                }
                vetorResultado2[i]=qtdDivisores;
            } else {
                vetorResultado2[i]=0;
            }
        }

        String resultado1="Primeiro vetor resultante (soma dos pares com todos do segundo vetor): ";
        String resultado2="Segundo vetor resultante (quantidade de divisores dos ímpares no segundo vetor): ";
        
        for (int i=0; i<10; i++) {
            resultado1+=vetorResultado1[i]+" ";
            resultado2+=vetorResultado2[i]+" ";
        }
        
        JOptionPane.showMessageDialog(null, resultado1+"\n"+resultado2);
	}
}
