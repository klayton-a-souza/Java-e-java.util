package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 29;
		Integer idadeRef = Integer.valueOf(idade); // autoboxing
		System.out.println("Qual o seu primitivo? " + idadeRef.intValue());
		System.out.println(idadeRef.doubleValue());

		System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);

		System.out.println("SIZE: " + Integer.SIZE);
		System.out.println("BYTES: " + Integer.BYTES);

		String s = "10";

		Integer numero = Integer.valueOf(s); // unboxing

		System.out.println(numero);

		List<Integer> numerosInt = new ArrayList<>();
		numerosInt.add(29); // Autoboxing

	}

}
