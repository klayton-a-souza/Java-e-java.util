package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaCorrente contaCorrente1 = new ContaCorrente(222, 333);
		referencias[0] = contaCorrente1;
		System.out.println(referencias[0].toString());

		ContaPoupanca contaCorrente2 = new ContaPoupanca(444, 555);
		referencias[1] = contaCorrente2;
		System.out.println(referencias[1].toString());

		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(contaCorrente2.getNumero());
		System.out.println(ref.getNumero());

	}

}
