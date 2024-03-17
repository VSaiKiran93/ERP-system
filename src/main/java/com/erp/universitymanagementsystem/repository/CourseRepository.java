package com.erp.universitymanagementsystem.repository;


import com.erp.universitymanagementsystem.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface CourseRepository extends JpaRepository<Courses, Long> {

	// Custom query method to find courses by credit hours less than or equal to a specified value
    List<Courses> findByCreditHoursLessThanEqual(int creditHours);
    
    List<Courses> findByCourseID(Long id);
    
    List<Courses> findByName(String name);
    
    List<Courses> findByDescription(String description);
    
}
