package controller;

import model.Student;

public class StudentCollegeController implements IStudentController{

	public StudentCollegeController() {
		super();
	}

	@Override
	public float calculatePerformace(Student studentCollege) {
		float performancePercentage = studentCollege.getStudentAverageScore() * studentCollege.getStudentNumberApprovals() * 0.972f;
		return performancePercentage;
	}

	@Override
	public float calculateProgression(Student studentCollege) {
		float progressionPercentage = studentCollege.getStudentNumberApprovals() / 6;
		return progressionPercentage;
	}

}
