/**
 * 
 */
package com.dataaccessobjectpattern;

import java.util.List;

/**
 * @author RAyyachamy
 *
 */
public interface StudentDao {
	
	List<Student> getAllStudents();
	
	Student getStudent(int id);
	
	void updateStudent(Student student);
	
	void deleteStudent(Student student);

}
