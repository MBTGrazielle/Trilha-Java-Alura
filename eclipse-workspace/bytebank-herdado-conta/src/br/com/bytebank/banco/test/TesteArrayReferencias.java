
package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(123, 5897);
		ContaPoupanca cp1 = new ContaPoupanca(589, 7425);

		referencias[0] = cc1;
		referencias[1] = cp1;

		Conta ref = cc1;
		Conta ref1 = cp1;
		ContaPoupanca ref2 = (ContaPoupanca) referencias[1];

		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		System.out.println(cc1);
		System.out.println(cp1);
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(ref2);
//
//		System.out.println(cc1);
//		System.out.println("Agência: " + cc1.getAgencia());
//		System.out.println("Número: " + cc1.getNumero());
//		System.out.println(contas[0]);
//		System.out.println("Número: " + contas[0].getNumero());
//		System.out.println("Agência: " + contas[0].getAgencia());
//
//		System.out.println(cc2);
//		System.out.println("Agência: " + cc2.getAgencia());
//		System.out.println("Número: " + cc2.getNumero());
//		System.out.println(contas[1]);
//		System.out.println("Número: " + contas[1].getNumero());
//		System.out.println("Agência: " + contas[1].getAgencia());

//		int[] refs = { 1, 2, 3, 4, 5 };
//
//		System.out.println(refs[0]);

	}

}
