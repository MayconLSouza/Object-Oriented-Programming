package view;

import java.text.DecimalFormat;

import model.Circulo;

public class Principal {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5);
		DecimalFormat df = new DecimalFormat("#.00");
		double perimetro = circulo.getPerimetro();
		double area = circulo.getArea();
		System.out.println("Perimetro = " + df.format(perimetro));
		System.out.println("Area = " + df.format(area));
	}

}
