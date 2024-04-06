package view;

import controller.ContratacaoFuncionarioTempoIntegral;
import controller.ContratacaoFuncionarioTempoParcial;
import controller.ContratacaoFuncionarioTemporario;
import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario fIntegral = null;
		ContratacaoFuncionarioTempoIntegral integralCont = new ContratacaoFuncionarioTempoIntegral();
		fIntegral = integralCont.contratacao();
		System.out.println(fIntegral);
		
		Funcionario fParcial = null;
		ContratacaoFuncionarioTempoParcial parcialCont = new ContratacaoFuncionarioTempoParcial();
		fParcial = parcialCont.contratacao();
		System.out.println(fParcial);
		
		Funcionario fTemporario = null;
		ContratacaoFuncionarioTemporario temporarioCont = new ContratacaoFuncionarioTemporario();
		fTemporario = temporarioCont.contratacao();
		System.out.println(fTemporario);
		
	}

}
