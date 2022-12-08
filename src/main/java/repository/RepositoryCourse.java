package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Course;

@Repository
public interface RepositoryCourse extends JpaRepository<Course, Long> {
    public List<Course>findbyName(String name);
}
