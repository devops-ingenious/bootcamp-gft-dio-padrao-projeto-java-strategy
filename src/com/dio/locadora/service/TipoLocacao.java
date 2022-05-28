package com.dio.locadora.service;

import com.dio.locadora.service.locacao.PessoaFisica;
import com.dio.locadora.service.locacao.PessoaJuridica;

public enum TipoLocacao {

	PESSOA_FISICA {
		@Override
		public Locacao obterLocacao() {
			return new PessoaFisica();
		}
	},
	PESSOA_JURIDICA {
		@Override
		public Locacao obterLocacao() {
			return new PessoaJuridica();
		}
	};
	
	public abstract Locacao obterLocacao();
	
}
