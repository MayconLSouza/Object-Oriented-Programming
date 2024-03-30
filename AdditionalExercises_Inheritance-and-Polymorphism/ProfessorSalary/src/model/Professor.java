package model;

public class Professor {

	private String professorName;
	private String professorID;
	private int professorAge;
	
	public Professor() {
		super();
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getProfessorID() {
		return professorID;
	}

	public void setProfessorID(String professorID) {
		this.professorID = professorID;
	}

	public int getProfessorAge() {
		return professorAge;
	}

	public void setProfessorAge(int professorAge) {
		this.professorAge = professorAge;
	}
	
	@Override
	public String toString() {
		return professorName + "\n" + professorID + "\n" + professorAge;
	}

}
