package view;

import model.AdjunctProfessor;
import model.FullProfessor;

public class Principal {

	public static void main(String[] args) {
		FullProfessor fp = new FullProfessor();
		
		fp.setProfessorName("João");
		fp.setProfessorID("111222");
		fp.setProfessorAge(60);
		fp.setProfessorYearsInInstitution(12);
		fp.setProfessorBaseSalary(10000.0f);
		float fpSalary = fp.calculateFullProfessorFinalSalary();
		
		System.out.println(fp);
		System.out.println(fp.getProfessorYearsInInstitution() + " years in FATEC");
		System.out.println("$" + fpSalary);
		System.out.println("***************************");
		
		AdjunctProfessor ap = new AdjunctProfessor();
		
		ap.setProfessorName("Maria");
		ap.setProfessorID("111333");
		ap.setProfessorAge(50);
		ap.setProfessorHoursPerClass(80);
		ap.setValueHoursPerClass(100.0f);
		float apSalary = ap.calculateAdjunctProfessorFinalSalary();
		
		System.out.println(ap);
		System.out.println("$" + apSalary);
		
	}

}
