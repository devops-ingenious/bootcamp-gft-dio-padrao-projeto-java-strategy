package com.dio.locadora;

import java.util.Scanner;

import com.dio.locadora.service.Locacao;
import com.dio.locadora.service.TipoLocacao;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("***********************************************************************");
			System.out.println("******************** OR�AMENTO LOCA��O DE VE�CULOS ********************");
			System.out.println("***********************************************************************");
			System.out.println();
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Informe a quantidade de dias: ");
			int dias = sc.nextInt();
			
			System.out.print("Tipo de cliente - [1] Pessoa F�sica [2] Pessoa Jur�dica: ");
			int opcaoCliente = sc.nextInt();
			TipoLocacao tipoCliente = TipoLocacao.values()[opcaoCliente - 1];
			Locacao cliente = tipoCliente.obterLocacao();
			
			double preco = cliente.calcularPreco(dias);
			System.out.printf("Valor total: R$ %.2f", preco);
			System.out.println();
			System.out.println();
			System.out.println("Todos os nossos ve�culos possuem seguro!");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
		}
	}
	
}
