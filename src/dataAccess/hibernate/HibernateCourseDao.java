package dataAccess.hibernate;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements ICourseDao {
    private List<Course> courses;
    public HibernateCourseDao(){
        this.setCourses(new ArrayList<Course>());
    }

    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public void add(Course course) {
        this.courses.add(course);
        System.out.println("Kurslar Hibernate ile db'e eklendi " + course.getName());
    }
}
