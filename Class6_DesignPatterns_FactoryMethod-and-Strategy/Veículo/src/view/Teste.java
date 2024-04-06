package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Teste {

	public static void main(String[] args) {
		Passeio passeio = new Passeio();
		Motor motorPasseio = new Motor();
		
		passeio.setPlaca("AAA0000");
		passeio.setMarca("Fiat");
		passeio.setModelo("Uno");
		passeio.setCor("Vermelho");
		passeio.setVelocMax(120.0f);
		passeio.setQtdRoda(4);
		motorPasseio.setQtdPistao(4);
		motorPasseio.setPotencia(80);
		passeio.setMotor(motorPasseio);
		passeio.setQtdPassageiros(5);
		
		System.out.println("Passeio = " + passeio.calcVel(passeio.getVelocMax()) + " m/h");
		
		Carga carga = new Carga();
		Motor motorCarga = new Motor();
		
		carga.setPlaca("BBB1111");
		carga.setMarca("Mercedes");
		carga.setModelo("Actros");
		carga.setCor("Preto");
		carga.setVelocMax(100.0f);
		carga.setQtdRoda(6);
		motorCarga.setQtdPistao(6);
		motorCarga.setPotencia(240);
		carga.setMotor(motorCarga);
		carga.setCargaMax(18);
		carga.setTara(8);
		
		System.out.println("Carga = " + carga.calcVel(carga.getVelocMax()) + " cm/h");
		
	}

}
