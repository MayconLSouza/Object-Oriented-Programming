package model;

public class StudentCollege extends Student {
	
	private String studentHighSchoolInstitution;
	private int studentHighSchoolConclusionYear;

	public StudentCollege() {
		super();
	}

	public String getStudentHighSchoolInstitution() {
		return studentHighSchoolInstitution;
	}

	public void setStudentHighSchoolInstitution(String studentHighSchoolInstitution) {
		this.studentHighSchoolInstitution = studentHighSchoolInstitution;
	}

	public int getStudentHighSchoolConclusionYear() {
		return studentHighSchoolConclusionYear;
	}

	public void setStudentHighSchoolConclusionYear(int studentHighSchoolConclusionYear) {
		this.studentHighSchoolConclusionYear = studentHighSchoolConclusionYear;
	}
	
	@Override
	public String toString() {
		return "Id = " + getStudentId() + "\nName = " + getStudentName() + "\nEmail = " + getStudentEmail()
				+ "\nNumber of Approvals = " + getStudentNumberApprovals() + "\nAverage Score = " + getStudentAverageScore()
				+ "\nHigh School Institution = " + studentHighSchoolInstitution + "\nClass of " + studentHighSchoolConclusionYear;
	}
	
}
