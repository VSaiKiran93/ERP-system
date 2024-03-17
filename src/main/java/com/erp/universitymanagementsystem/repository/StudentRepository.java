package com.erp.universitymanagementsystem.repository;


import com.erp.universitymanagementsystem.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Students, Long> {
    // You can add custom query methods here if needed
	List<Students> findByAgeGreaterThan(int age);
	
	List<Students> findByFirstNameAndLastName(String firstName, String lastName);
	
	List<Students> findByStudentId(Long id);
	
	List<Students> findByGender(String gender);
	
	List<Students> findByEmail(String email);
	
	List<Students> findByPhoneNumber(String phoneNumber);
	
	
}

