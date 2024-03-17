package com.erp.universitymanagementsystem.repository;

import com.erp.universitymanagementsystem.Students;
import com.erp.universitymanagementsystem.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teachers, Long> {

	List<Teachers> findBySubjectAndGender(String subject, String gender);
	
	List<Teachers> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Students> findByGender(String gender);
	
	List<Students> findByEmail(String email);
	
	List<Students> findByPhoneNumber(String phoneNumber);
	
	
}
