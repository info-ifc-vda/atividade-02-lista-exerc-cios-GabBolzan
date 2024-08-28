package com.computaria.bolzan.Lista01;

import javax.swing.JOptionPane;

public class Ex08 {
	public static void main(String[] args) {
		float pago;
        float valor;
        float troco;
        int cont;
        int[] cedulas = {200,100,50,20,10,5,2,1};
        String msg="";

        String v = JOptionPane.showInputDialog("Digide o valor a ser pago:\n");
        valor = Float.parseFloat(v);
        String p = JOptionPane.showInputDialog("Digite o valor pago:\n");
        pago = Float.parseFloat(p);
        valor-=pago;
        valor*=(-1);
        troco=valor;
        
        msg+="O troco tem: \n";
        
        for (int cedula: cedulas){
            cont = (int)troco/cedula;
            if (cont>0){
                msg+=cont+" nota(s) de "+cedula+"\n";
            }
            
            troco = troco%cedula;
        }
        
        JOptionPane.showMessageDialog(null, msg);
	}
}
