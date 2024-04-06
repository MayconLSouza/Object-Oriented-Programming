package controller;

import javax.swing.JOptionPane;

public class ImpostoSaoPaulo implements IImpostoStrategy {

	@Override
	public void calcularImposto() {
		Double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total"));
		int numeroComodos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cômodos"));
		float imposto = (float) ((areaTotal * 10) + (numeroComodos * 2));
		System.out.println("Valor do imposto urbano (SP) = $" + imposto);
	}

}
