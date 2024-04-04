package controller;

import model.Student;

public class StudentTechnicalController implements IStudentController {

	public StudentTechnicalController() {
		super();
	}

	@Override
	public float calculatePerformace(Student studentTechnical) {
		float performancePercentage = studentTechnical.getStudentAverageScore() * studentTechnical.getStudentNumberApprovals() * 0.931f;
		return performancePercentage;
	}

	@Override
	public float calculateProgression(Student studentTechnical) {
		float progressionPercentage = studentTechnical.getStudentNumberApprovals() / 3;
		return progressionPercentage;
	}

}
