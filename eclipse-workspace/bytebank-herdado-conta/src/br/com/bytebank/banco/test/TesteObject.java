package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);

		System.out.println(cc);
		System.out.println(cp);
	}
}
