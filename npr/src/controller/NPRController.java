package controller;

import util.pilha;

public class NPRController {

	public static void insereValor(double n, pilha p) {
		p.push(n);
	}
	
	public static void npr(String op, pilha p) {
		
			if (p.tamanho() < 2) {
				System.out.println("Digitos insuficientes para realizar operação!");
			} else {
				
				double a = p.top(); 
				if (op.equals("/") && a == 0) {
				    System.out.println("Divisão por zero!");			    
				} else {
					a = p.pop();
					double b = p.pop();
								
					if (op.equals("+")) {p.push(a + b);}
					else if (op.equals("-")) {p.push(b - a);}
					else if (op.equals("*")) {p.push(a * b);}
					else if (op.equals("/")) {p.push(b / a);}
				}
			}
	}
}
