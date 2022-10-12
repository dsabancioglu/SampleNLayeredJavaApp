package dataAccess.jdbc;

import dataAccess.ICourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements ICourseDao {
    private List<Course> courses;

    public JdbcCourseDao(){
        this.courses = new ArrayList<Course>();
    }
    @Override
    public void add(Course course) {
        this.courses.add(course);
        System.out.println("Kurslar Jdbc ile db'e eklendi ");
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
