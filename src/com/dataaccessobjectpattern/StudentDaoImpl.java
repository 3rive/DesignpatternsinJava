/**
 * 
 */
package com.dataaccessobjectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RAyyachamy
 *
 */
public class StudentDaoImpl implements StudentDao {
	
	List<Student> students;

	/* (non-Javadoc)
	 * @see com.dataaccessobjectpattern.StudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	/**
	 * 
	 */
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		students.add(student1);
		students.add(student2);
	}

	/* (non-Javadoc)
	 * @see com.dataaccessobjectpattern.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int id) {
		return students.get(id);
	}

	/* (non-Javadoc)
	 * @see com.dataaccessobjectpattern.StudentDao#updateStuent(com.dataaccessobjectpattern.Student)
	 */
	@Override
	public void updateStudent(Student student) {
	      students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	/* (non-Javadoc)
	 * @see com.dataaccessobjectpattern.StudentDao#deleteStudent(com.dataaccessobjectpattern.Student)
	 */
	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
	      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

}
