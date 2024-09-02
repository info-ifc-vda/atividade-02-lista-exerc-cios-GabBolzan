package com.computaria.bolzan.Lista02;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		int matriz[][] = new int[7][7];
        int vetorMaiorLinha[] = new int[7];
        int vetorMenorColuna[] = new int[7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da matriz: "));
            }
        }

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            vetorMaiorLinha[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            vetorMenorColuna[j] = menor;
        }

        String matrizTexto = "Matriz 7x7:\n";
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrizTexto += matriz[i][j] + "\t";
            }
            matrizTexto += "\n";
        }

        String vetorMaiorTexto = "Vetor dos maiores elementos de cada linha:\n";
        
        for (int i = 0; i < 7; i++) {
            vetorMaiorTexto += vetorMaiorLinha[i] + " ";
        }
        
        String vetorMenorTexto = "\nVetor dos menores elementos de cada coluna:\n";
        
        for (int j = 0; j < 7; j++) {
            vetorMenorTexto += vetorMenorColuna[j] + " ";
        }

        JOptionPane.showMessageDialog(null, matrizTexto + "\n" + vetorMaiorTexto + "\n" + vetorMenorTexto);
	}
}
