package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListaJava {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);
		System.out.println(aulas);

		/* Percorrendo uma lista */
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula � " + primeiraAula);

		/* Nesse caso, utilizamos o m�todo size para limitar o nosso for: */
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}

		/*
		 * Aqui estamos falando que, para cada String aula, determinado bloco de c�digo
		 * deve ser executado. Essa vari�vel aula poderia ter o nome que voc� desejasse.
		 */
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		/*Ordenando a Lista*/
		Collections.sort(aulas);

	}
}
