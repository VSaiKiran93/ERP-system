package com.erp.universitymanagementsystem.service;

import com.erp.universitymanagementsystem.Teachers;
import com.erp.universitymanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teachers> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teachers getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public Teachers saveTeacher(Teachers teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }

    public List<Teachers> findTeachersBySubjectAndGender(String subject, String gender) {
        return teacherRepository.findBySubjectAndGender(subject, gender);
    }
}

