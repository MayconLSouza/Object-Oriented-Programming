package model;

public class FullProfessor extends Professor {

	private int professorYearsInInstitution;
	private float professorBaseSalary;
	
	public FullProfessor() {
		super();
	}

	public int getProfessorYearsInInstitution() {
		return professorYearsInInstitution;
	}

	public void setProfessorYearsInInstitution(int professorYearsInInstitution) {
		this.professorYearsInInstitution = professorYearsInInstitution;
	}

	public float getProfessorBaseSalary() {
		return professorBaseSalary;
	}

	public void setProfessorBaseSalary(float professorBaseSalary) {
		this.professorBaseSalary = professorBaseSalary;
	}
	
	public float calculateFullProfessorFinalSalary() {
		if (professorYearsInInstitution < 5) {
			return professorBaseSalary;
		} else {
			float finalSalary = (float) (professorBaseSalary + (professorBaseSalary * (((int) professorYearsInInstitution / 5) * 0.05)));
			return finalSalary;
		}
	}

}
