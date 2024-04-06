package controller;

import javax.swing.JOptionPane;

public class ImpostoBeloHorizonte implements IImpostoStrategy {

	@Override
	public void calcularImposto() {
		Double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total"));
		int numeroQuartos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de quartos"));
		float imposto = (float) ((areaTotal * 7) + (numeroQuartos * 4));
		System.out.println("Valor do imposto urbano (BH) = $" + imposto);
	}
	
}
