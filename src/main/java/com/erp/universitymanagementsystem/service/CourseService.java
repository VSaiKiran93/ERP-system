package com.erp.universitymanagementsystem.service;

import com.erp.universitymanagementsystem.Courses;
import com.erp.universitymanagementsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {	

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }

    public Courses getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Courses saveCourse(Courses course) {
        return courseRepository.save(course);
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }

    public List<Courses> findCoursesByCreditHoursLessThanEqual(int creditHours) {
        return courseRepository.findByCreditHoursLessThanEqual(creditHours);
    }
}
