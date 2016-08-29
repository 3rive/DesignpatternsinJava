/**
 * 
 */
package com.mvcpattern;

/**
 * @author RAyyachamy
 *
 */
public class MVCPattternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student model = fetchFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		controller.setStudentName("Malathi");
		controller.setStudentRollNo("54");
		controller.updateView();
	}

	/**
	 * @return
	 */
	private static Student fetchFromDatabase() {
		Student student = new Student();
		student.setName("Raja");
		student.setRollNo("34");
		return student;
	}

}
