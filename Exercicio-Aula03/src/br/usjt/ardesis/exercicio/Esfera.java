/**
 * 
 */
package br.usjt.ardesis.exercicio;

/**
 * @author Giovanni Maciel Canuto de Souza
 *
 */
public class Esfera extends Circulo implements Volume {

	
	public Esfera(double raio) {
		super(raio);
	}

	@Override
	public double calculaVolume() {
		return (4/3)*Math.PI*Math.pow(raio, 3);
	}

}
