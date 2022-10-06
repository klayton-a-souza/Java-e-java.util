package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		ArrayList<Conta> listaDeContas = new ArrayList<>();

		Conta contaCorrente01 = new ContaCorrente(111, 222);
		listaDeContas.add(contaCorrente01);

		Conta contaCorrente02 = new ContaCorrente(333, 444);
		listaDeContas.add(contaCorrente02);

		for (Object oReferencia : listaDeContas) {
			System.out.println(oReferencia);
		}
		
		System.out.println("-----------------------------------------");	
		
		Conta contaCorrente03 = new ContaCorrente(333, 444);
		boolean existe = listaDeContas.contains(contaCorrente03);
		System.out.println("Uma conta com os mesmo valores de agencia e numero ja foi adicionada? " + existe);		

	}

}
