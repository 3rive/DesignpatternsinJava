/**
 * 
 */
package com.dataaccessobjectpattern;

/**
 * @author RAyyachamy
 *
 */
public class DaoPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		//print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo()
					+ ", Name : " + student.getName() + " ]");
		}
		//update the student
		Student student =studentDao.getStudent(0);
		student.setName("Michael");
	    studentDao.updateStudent(student);
	    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	    
	  //print all students
		for (Student updatedstudent : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + updatedstudent.getRollNo()
					+ ", Name : " + updatedstudent.getName() + " ]");
		}

	}

}
