/**
 * 
 */
package br.usjt.ardesis.exercicio;

/**
 * @author Giovanni Maciel Canuto de Souza
 *
 */
public class Piramide extends Cubo implements Volume {

	
	@Override
	public double calculaVolume() {
		return ((1/3)*(comprimento*largura*altura));
	}

}
