package dataAccess;

import entities.Course;
import entities.Instructor;

import java.util.List;

public interface ICourseDao {
    void add(Course course);
    List<Course> getCourses();
    void setCourses (List<Course> courses);
}
