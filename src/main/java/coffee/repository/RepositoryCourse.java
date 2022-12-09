package coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coffee.model.Course;

public interface RepositoryCourse extends JpaRepository<Course, Long> {
   // public List<Course>findbyName(String name);
}
