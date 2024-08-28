package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		int idade[][] = new int[5][11];
		double peso[][] = new double[5][11];
		double altura[][] = new double[5][11];
		int menorDezoito=0;
		double mediaIdade[] = new double[5];
		double mediaAltura=0;
		double maiorOitenta=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<11; j++) {
				idade[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador "+(j+1)+" do time "+(i+1)));
				peso[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do jogador "+(j+1)+" do time "+(i+1)));
				altura[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador "+(j+1)+" do time "+(i+1)));
			}			
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<11; j++) {
				if(idade[i][j]<18) {
					menorDezoito++;
				}
				
				mediaIdade[j]+=idade[i][j];
				
				mediaAltura+=altura[i][j];
				
				if(peso[i][j]>80) {
					maiorOitenta+=peso[i][j];
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			mediaIdade[i]/=11;
		}
		
		mediaAltura/=55;
		
		maiorOitenta=maiorOitenta/55*100;
		
		JOptionPane.showMessageDialog(null, "Quantidade de jogadores menores de 18 anos: "+menorDezoito+"\n"
				+ "Média de altura de todos os jogadores: "+mediaAltura+"m\n"
						+ "Jogadores com mais de 80kg: "+maiorOitenta+"%");
	}
}
