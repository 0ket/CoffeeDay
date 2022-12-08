package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Course;
import repository.RepositoryCourse;

@Service
public class ServiceCourse {
    
    @Autowired
    private RepositoryCourse repositoryCourse;

    public List<Course> findAllCurses(){
        return repositoryCourse.findAll();
    }

    public void saveCurse(Course course){
        repositoryCourse.save(course);
    }

    public Course findByIdCourse(Long id){
        return repositoryCourse.findById(id).orElse(null);
    }

    public void deleteCourse(Long id){
        repositoryCourse.deleteById(id);
    }
}
