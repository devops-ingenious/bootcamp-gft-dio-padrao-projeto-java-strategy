package com.dio.locadora.service.locacao;

import com.dio.locadora.service.Locacao;

public class PessoaJuridica implements Locacao {

	public double calcularPreco(int dias) {
		return dias * 751.00 + 15;
	}
	
}
