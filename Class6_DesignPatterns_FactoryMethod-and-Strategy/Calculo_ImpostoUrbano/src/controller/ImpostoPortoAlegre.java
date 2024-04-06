package controller;

import javax.swing.JOptionPane;

public class ImpostoPortoAlegre implements IImpostoStrategy {

	@Override
	public void calcularImposto() {
		Double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a área total"));
		int flagGaragem = 0;
		float imposto = 0;
		String msgGaragem = """
							Possui garagem?"
							1 - sim
							2 - não
							""";
		flagGaragem = Integer.parseInt(JOptionPane.showInputDialog(msgGaragem));
		while (flagGaragem != 1 && flagGaragem != 2) {
			JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
			flagGaragem = Integer.parseInt(JOptionPane.showInputDialog(msgGaragem));
		}
		if(flagGaragem == 1) {
			Double areaGaragem = Double.parseDouble(JOptionPane.showInputDialog("Digite a área da garagem"));
			imposto = (float) ((areaTotal * 7.5) + (areaGaragem * 2.5));
		} else if (flagGaragem == 2) {
			imposto = (float) (areaTotal * 8);
		} else {
			System.err.println("Erro no cálculo do imposto (PA)");
			System.exit(1);
		}
		System.out.println("Valor do imposto urbano (PA) = $" + imposto);
	}

}
