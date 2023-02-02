package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = "     Alura    ";
		vazio.trim();

		System.out.println(vazio.contains("lu"));

//		System.out.println(vazio.isEmpty());

		String nome = "Alura";
//		System.out.println(nome);

		int numero = nome.length();
//		System.out.println(numero);

//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}

//		String sub = nome.substring(4);
//		System.out.println(sub);
//
//		char c = nome.charAt(2);
//		System.out.println(c);
//
//		int indice = nome.indexOf("ur");
//		System.out.println(indice);
//
//		String novoNome = nome.replace("a", "b");

		// String novoNome = nome.toLowerCase();

		// System.out.println(novoNome);

	}

}
