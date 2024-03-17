package com.erp.universitymanagementsystem.repository;


import com.erp.universitymanagementsystem.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    // You can add custom query methods here if needed
	
	// Custom query method to find classrooms by location containing a keyword and having a capacity greater than a specified value
    List<Classroom> findByLocationContainingAndCapacityGreaterThan(String keyword, int capacity);

    // Custom query method to find a classroom by name ignoring case sensitivity
    Optional<Classroom> findByNameIgnoreCase(String name);
}

