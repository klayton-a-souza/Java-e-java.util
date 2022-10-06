package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta contaCorrente01 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		contaCorrente01.setTitular(clienteCC1);
		contaCorrente01.deposita(333.0);

		Conta contaCorrente02 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		contaCorrente02.setTitular(clienteCC2);
		contaCorrente02.deposita(444.0);

		Conta contaCorrente03 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		contaCorrente03.setTitular(clienteCC3);
		contaCorrente03.deposita(111.0);

		Conta contaCorrente04 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		contaCorrente04.setTitular(clienteCC4);
		contaCorrente04.deposita(222.0);

		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(contaCorrente01);
		listaDeContas.add(contaCorrente02);
		listaDeContas.add(contaCorrente03);
		listaDeContas.add(contaCorrente04);

		for (Conta conta : listaDeContas) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

		listaDeContas.sort(new TitularDaContaComparator());
		//listaDeContas.sort(null); // Passando null no parameto do metodo sort, ele utiliza a ordem natural, que
									// foi definida na classe conta, atravez do saldo.

		// Collections.sort(listaDeContas, new NumeroDaContaComparator());
		Collections.sort(listaDeContas);
		//Collections.rotate(listaDeContas, 2);

		System.out.println("---------------------------------------------------------------------");

		for (Conta conta : listaDeContas) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {

		String nomeConta01 = conta1.getTitular().getNome();
		String nomeConta02 = conta2.getTitular().getNome();
		return nomeConta01.compareTo(nomeConta02);
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {

		return Integer.compare(conta1.getNumero(), conta2.getNumero());

	}

}
