package controller;

import javax.swing.JOptionPane;

public class ImpostoCuritiba implements IImpostoStrategy {

	@Override
	public void calcularImposto() {
		Double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total"));
		int idadeImovel = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do imóvel"));
		float imposto = 0;
		if(idadeImovel > 50) {
			imposto = (float) ((areaTotal * 5) + (idadeImovel * 3));
		} else if (idadeImovel < 20) {
			imposto = (float) ((areaTotal * 5) + (idadeImovel * 2));
		} else if (idadeImovel >= 20 && idadeImovel <= 50) {
			imposto = (float) ((areaTotal * 5) + (idadeImovel * 2.5));
		} else {
			System.err.println("Erro no cálculo do imposto (CB)");
			System.exit(1);
		}
		System.out.println("Valor do imposto urbano (CB) = $" + imposto);
	}

}
