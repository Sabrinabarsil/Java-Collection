
/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
- Armazenar dados da List
- Remover dados da list;
- Atualizar dados da list.
- Apresentar todos os dados da list.*/

package br.com.generation.exerciciosJava;

import java.util.ArrayList;

public class ExercicioCollections {

	public static void main(String[] args) {
		String estoque1 = "Skol";
		String estoque2 = "Império";
		String estoque3 = "Cacildis";
		String estoque4 = "Corona";
		String estoque5 = "Baden Baden";
		String estoque6 = "Brahma";
		String estoque7 = "Serrana";
		String estoque8 = "heineken";
		String estoque9 = "stella artois";
		String estoque10 = "Eisenbahn";

		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		estoque.add(estoque5);
		estoque.add(estoque6);
		estoque.add(estoque7);
		estoque.add(estoque8);
		estoque.add(estoque9);
		estoque.add(estoque10);

		for (String A : estoque) {
			System.out.println();
			System.out.println("Cerveja Disponivel: " + A);
			
		}

		System.out.println("\nControle");

		System.out.println("Adicionando: " + estoque10);
		estoque.add(estoque10);
		System.out.println(estoque);

		System.out.println("\nRemovendo: " + estoque3);
		estoque.remove(2);
		System.out.println(estoque);

	}

}
