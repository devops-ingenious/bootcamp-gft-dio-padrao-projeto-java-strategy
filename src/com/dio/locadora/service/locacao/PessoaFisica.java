package com.dio.locadora.service.locacao;

import com.dio.locadora.service.Locacao;

public class PessoaFisica implements Locacao {

	public double calcularPreco(int dias) {
		return dias * 50.00 + 10;
	}
	
}
