package br.com.bytebank.banco.test.util;

import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteVector {
	public static void main(String[] args) {

		Vector<Conta> listaDeContas = new Vector<>();

		Conta contaCorrente01 = new ContaCorrente(111, 222);
		listaDeContas.add(contaCorrente01);

		Conta contaCorrente02 = new ContaCorrente(333, 444);
		listaDeContas.add(contaCorrente02);

		System.out.println(listaDeContas.size());

		System.out.println(listaDeContas.get(0).getNumero());

		Conta contaCorrente03 = new ContaCorrente(111, 222);
		listaDeContas.add(contaCorrente03);

		Conta contaCorrente04 = new ContaCorrente(333, 444);
		listaDeContas.add(contaCorrente04);
		
		for (int i = 0; i < listaDeContas.size(); i++) {
			System.out.println(listaDeContas.get(i));			
		}
		
		System.out.println("-----------------------------------------");
		
		for (Object oReferencia : listaDeContas) {
			System.out.println(oReferencia);
		}

	}

}
