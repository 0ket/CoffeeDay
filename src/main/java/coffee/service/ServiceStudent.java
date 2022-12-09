package coffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coffee.model.Student;
import coffee.repository.RepositoryStudent;

@Service
public class ServiceStudent {
    
    @Autowired
    private RepositoryStudent repositoryStudent;
    
    public List<Student> findAllStudents() {
        return repositoryStudent.findAll();
    }
    
    public void saveStudent(Student student) {
        repositoryStudent.save(student);
    }

    public Student findStudentById(Long id) {
        return repositoryStudent.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        repositoryStudent.deleteById(id);
    }
}
