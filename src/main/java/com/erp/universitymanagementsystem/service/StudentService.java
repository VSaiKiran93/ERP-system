package com.erp.universitymanagementsystem.service;


import com.erp.universitymanagementsystem.Students;
import com.erp.universitymanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
	public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public Students getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Students saveStudent(Students student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Students> findStudentsByAgeGreaterThan(int age) {
        return studentRepository.findByAgeGreaterThan(age);
    }

    public List<Students> findStudentsByFirstNameAndLastName(String firstName, String lastName) {
        return studentRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}
