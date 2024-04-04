package view;

import model.Paralelogramo;
import model.Trapezio;

public class Principal {

	public static void main(String[] args) {
		Paralelogramo p = new Paralelogramo();
		
		p.setQuadrilateroBase(5);
		p.setQuadrilateroAltura(4);
		
		System.out.println("Base = " + p.getQuadrilateroBase() + " cm");
		System.out.println("Altura = " + p.getQuadrilateroAltura() + " cm");
		System.out.println("Perímetro = " + p.calcularPerimetro() + " cm");
		System.out.println("Área = " + p.calcularArea() + " cm²");
		
		System.out.println("*****************************************");
		
		Trapezio t = new Trapezio();
		
		t.setQuadrilateroBase(20);
		t.setBaseMenor(12);
		t.setQuadrilateroAltura(15);
		
		System.out.println("Base = " + t.getQuadrilateroBase() + " cm");
		System.out.println("Base menor = " + t.getBaseMenor() + " cm");
		System.out.println("Altura = " + t.getQuadrilateroAltura() + " cm");
		System.out.println("Perímetro = " + t.calcularPerimetro() + " cm");
		System.out.println("Área = " + t.calcularArea() + " cm²");
	}

}
