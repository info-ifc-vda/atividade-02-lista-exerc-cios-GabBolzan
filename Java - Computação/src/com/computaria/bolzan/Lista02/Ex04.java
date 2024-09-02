package com.computaria.bolzan.Lista02;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		int saldos[] = new int[10];
		int codigos[] = new int[10];
		int soma=0;
		int op=0;
		int cod;
		int codTemp;
		int encontrado=0;
		int valSaque=0;
		boolean livre=true;
		
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("\n1 - Consultar Saldo"
					+"\n2 - Depositar"
					+"\n3 - Sacar"
					+"\n4 - Consultar Ativo Bancário"
					+"\n5 - Cadastrar novo código"
					+"\n6 - Finalizar"));
			
			if(op==6) {
				break;
			}
			else if(op==1) {
				cod=Integer.parseInt(JOptionPane.showInputDialog("\nDigite o código da conta que deseja consultar: "));
				
				if(procurarCodigo(cod, codigos, saldos, encontrado)==true) {
					JOptionPane.showMessageDialog(null, "\nCódigo: "+codigos[encontrado]
							+"\nSaldo: R$"+saldos[encontrado]+"\n");
				}
			}
			else if(op==2) {
				cod=Integer.parseInt(JOptionPane.showInputDialog("\nDigite o código da conta que deseja depositar: "));
				
				if(procurarCodigo(cod, codigos, saldos, encontrado)==true) {					
					saldos[encontrado]=Integer.parseInt(JOptionPane.showInputDialog("\nCódigo: "+codigos[encontrado]
							+"\nSaldo: R$"+saldos[encontrado]+"\n"
							+"Valor a depositar: R$"));
				}
			}
			else if(op==3) {
				cod=Integer.parseInt(JOptionPane.showInputDialog("\nDigite o código da conta que deseja consultar: "));
				
				if(procurarCodigo(cod, codigos, saldos, encontrado)==true) {
					valSaque=Integer.parseInt(JOptionPane.showInputDialog(JOptionPane.showInputDialog("\nCódigo: "+codigos[encontrado]
							+"\nSaldo: R$"+saldos[encontrado]+"\n"
							+"\nDigite o valor que deseja sacar: ")));
					
					if(saldos[encontrado]>=valSaque) {
						saldos[encontrado]-=valSaque;
					}
					else {
						JOptionPane.showMessageDialog(null, "O valor que deseja sacar é maior que o valor disponível!");
					}
				}
			}
			else if(op==4) {
				for(int i=0; i<saldos.length; i++) {
					soma+=saldos[i];
				}
				
				JOptionPane.showMessageDialog(null, "Ativo bancário: R$"+soma);
			}
			else if(op==5) {
				int j=(Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do vetor em que deseja adicionar o código: (Não pode 0)"))-1);
				
				codTemp=Integer.parseInt(JOptionPane.showInputDialog("Digite o código que deseja adicionar a posição "+(j+1)+": "));
				
				for(int i=0; i<codigos.length; i++) {
					if(codigos[i]==codigos[j] && codigos[j]!=0) {
						livre=false;
					}
				}
				
				if(livre==false) {
					JOptionPane.showMessageDialog(null, "O código já está em uso!");
				}
				else {
					codigos[j]=codTemp;
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
			}
		}
	}
	
	public static boolean procurarCodigo(int cod, int codigos[], int saldos[], int encontrado) {
		encontrado=0;
		
		for(int i=0; i<codigos.length; i++) {
			if(codigos[i]==cod && cod!=0) {
				encontrado=i;
			}
		}
		
		if(encontrado!=0) {
			JOptionPane.showMessageDialog(null, "\nCódigo encontrado!\n");
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "\nCódigo não encontrado!");
			return false;
		}
	}
}