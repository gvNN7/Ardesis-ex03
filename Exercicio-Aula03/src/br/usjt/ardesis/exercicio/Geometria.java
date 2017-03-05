/**
 * 
 */
package br.usjt.ardesis.exercicio;

import java.util.ArrayList;

/**
 * @author Giovanni Maciel Canuto de Souza 
 *
 */
public class Geometria {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(4));
		figuras.add(new Triangulo(2,2,2,3,4));
		figuras.add(new Quadrado(5));

		

	}

}
