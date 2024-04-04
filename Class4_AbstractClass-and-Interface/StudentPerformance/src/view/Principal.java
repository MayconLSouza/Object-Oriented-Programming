package view;

import controller.StudentCollegeController;
import controller.StudentTechnicalController;
import model.StudentCollege;
import model.StudentTechnical;

public class Principal {

	public static void main(String[] args) {
		StudentTechnical technician = new StudentTechnical();
		
		technician.setStudentName("João");
		technician.setStudentId("123456");
		technician.setStudentEmail("joao@email.com");
		technician.setStudentNumberApprovals(10);
		technician.setStudentAverageScore(8.5f);
		
		StudentTechnicalController technicianController = new StudentTechnicalController();
		
		System.out.println(technician);
		System.out.println("Performance =  " + technicianController.calculatePerformace(technician) + "%");
		System.out.println("Progression = " + technicianController.calculateProgression(technician) + "%");
		
		System.out.println("********************************************");
		
		StudentCollege academic = new StudentCollege();
		
		academic.setStudentName("Maria");
		academic.setStudentId("654321");
		academic.setStudentEmail("maria@email.com");
		academic.setStudentNumberApprovals(8);
		academic.setStudentAverageScore(6.9f);
		academic.setStudentHighSchoolInstitution("East Great Falls");
		academic.setStudentHighSchoolConclusionYear(1999);
		
		StudentCollegeController academicController = new StudentCollegeController();
		
		System.out.println(academic);
		System.out.println("Performance =  " + academicController.calculatePerformace(academic) + "%");
		System.out.println("Progression = " + academicController.calculateProgression(academic) + "%");
	}

}
