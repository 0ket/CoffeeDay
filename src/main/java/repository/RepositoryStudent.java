package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public interface RepositoryStudent extends JpaRepository<Student,Long>{
    public List<Student> findbyName(String Name);
}
