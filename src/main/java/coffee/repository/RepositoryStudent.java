package coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coffee.model.Student;

public interface RepositoryStudent extends JpaRepository<Student,Long>{
   // public List<Student> findbyName(String Name);
}
