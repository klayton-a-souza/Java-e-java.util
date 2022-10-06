package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		
		Character charRef = Character.valueOf('a'); 		//autoboxing
		System.out.println(charRef.charValue());			//unboxing
		
		Double dRef = Double.valueOf(3.5);					//autoboxing
		System.out.println(dRef.doubleValue());				//unboxing	
		
		Boolean bRef = Boolean.FALSE;						//autoboxing
		System.out.println(bRef.booleanValue());			//unboxing
		
		Number refNumero = Integer.valueOf(29);
		System.out.println(refNumero.intValue());

		List<Number> listaNumerica = new ArrayList<>();
		listaNumerica.add(1);
		listaNumerica.add(2.2);	
		listaNumerica.add(3.3f);
	}

}
