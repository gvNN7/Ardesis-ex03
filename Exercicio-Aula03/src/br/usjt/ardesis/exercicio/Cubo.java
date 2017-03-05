/**
 * 
 */
package br.usjt.ardesis.exercicio;

/**
 * @author Giovanni Maciel Canuto de Souza
 *
 */
public class Cubo implements Volume{

	
	double comprimento, largura, altura;

	@Override
	public double calculaVolume() {
		return (comprimento*largura*altura);
	}

}
