package model;

public class AdjunctProfessor extends Professor {
	
	private int professorHoursPerClass;
	private float valueHoursPerClass;

	public AdjunctProfessor() {
		super();
	}

	public int getProfessorHoursPerClass() {
		return professorHoursPerClass;
	}

	public void setProfessorHoursPerClass(int professorHoursPerClass) {
		this.professorHoursPerClass = professorHoursPerClass;
	}

	public float getValueHoursPerClass() {
		return valueHoursPerClass;
	}

	public void setValueHoursPerClass(float valueHoursPerClass) {
		this.valueHoursPerClass = valueHoursPerClass;
	}
	
	public float calculateAdjunctProfessorFinalSalary() {
		return professorHoursPerClass * valueHoursPerClass;
	}

}
