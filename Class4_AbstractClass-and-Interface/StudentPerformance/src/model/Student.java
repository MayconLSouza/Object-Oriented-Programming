package model;

public abstract class Student {
	
	private String studentId; 
	private String studentName;
	private String studentEmail;
	private int studentNumberApprovals;
    private float studentAverageScore;
    
	public Student() {
		super();
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getStudentNumberApprovals() {
		return studentNumberApprovals;
	}

	public void setStudentNumberApprovals(int studentNumberApprovals) {
		this.studentNumberApprovals = studentNumberApprovals;
	}

	public float getStudentAverageScore() {
		return studentAverageScore;
	}

	public void setStudentAverageScore(float studentAverageScore) {
		this.studentAverageScore = studentAverageScore;
	}

	@Override
	public String toString() {
		return "Id = " + studentId + "\nName = " + studentName + "\nEmail = " + studentEmail
				+ "\nNumber of Approvals = " + studentNumberApprovals + "\nAverage Score = " + studentAverageScore;
	}
	
	

}
