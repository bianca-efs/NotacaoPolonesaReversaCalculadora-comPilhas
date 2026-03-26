package view;

import java.util.Scanner;
import util.pilha;
import controller.isOpOrN;
import controller.NPRController;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		pilha p = new pilha ();
		String op = "";
		
		while (!op.equalsIgnoreCase("cancell")) {
			System.out.print("Digite: ");
			op = sc.nextLine();
			
			if (isOpOrN.isNumber(op)) {
				double n = Double.parseDouble(op);
				NPRController.insereValor(n, p);
			} else if (isOpOrN.isOperation(op)) { 
				NPRController.npr(op, p);
			} else if (op.contentEquals("cancell")) {
				System.out.print("Operação Encerrada   |   ");
			} else {System.out.println("Digito inválido!");}
		}
		if (p.tamanho() > 0) {
		System.out.println("Resultado: "+ p.top());
		} else {System.out.println("Não há calculos!");}
	}

}
