package com.dio.locadora;

import java.util.Scanner;

import com.dio.locadora.service.Locacao;
import com.dio.locadora.service.TipoLocacao;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("***********************************************************************");
			System.out.println("******************** ORÇAMENTO LOCAÇÃO DE VEÍCULOS ********************");
			System.out.println("***********************************************************************");
			System.out.println();
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Informe a quantidade de dias: ");
			int dias = sc.nextInt();
			
			System.out.print("Tipo de cliente - [1] Pessoa Física [2] Pessoa Jurídica: ");
			int opcaoCliente = sc.nextInt();
			TipoLocacao tipoCliente = TipoLocacao.values()[opcaoCliente - 1];
			Locacao cliente = tipoCliente.obterLocacao();
			
			double preco = cliente.calcularPreco(dias);
			System.out.printf("Valor total: R$ %.2f", preco);
			System.out.println();
			System.out.println();
			System.out.println("Todos os nossos veículos possuem seguro!");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
		}
	}
	
}
