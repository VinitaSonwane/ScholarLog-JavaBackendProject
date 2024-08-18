package com.jbk.dao;

import com.jbk.entity.Student;

public interface SubjectDao extends StudentDao {

	Student deleteStudentById(Long rollNo);

}
