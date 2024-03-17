package com.erp.universitymanagementsystem.service;


import com.erp.universitymanagementsystem.Classroom;
import com.erp.universitymanagementsystem.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    private final ClassroomRepository classroomRepository;

    @Autowired
    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Classroom getClassroomById(Long id) {
        return classroomRepository.findById(id).orElse(null);
    }

    public Classroom saveClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public void deleteClassroomById(Long id) {
        classroomRepository.deleteById(id);
    }

    public List<Classroom> findClassroomsByLocationContainingAndCapacityGreaterThan(String keyword, int capacity) {
        return classroomRepository.findByLocationContainingAndCapacityGreaterThan(keyword, capacity);
    }

    public Optional<Classroom> findClassroomByNameIgnoreCase(String name) {
        return classroomRepository.findByNameIgnoreCase(name);
    }
}
