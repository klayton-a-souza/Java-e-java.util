package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeReferencias {
	
	public static void main(String[] args) {
		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta contaCorrente01 = new ContaCorrente(111, 222);
		guardadorDeContas.adiciona(contaCorrente01);
		
		Conta contaCorrente02 = new ContaCorrente(333, 444);
		guardadorDeContas.adiciona(contaCorrente02);
		
		int tamanho = guardadorDeContas.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardadorDeContas.getReferencia(0);
		System.out.println(ref.getNumero());
		
	}

}
