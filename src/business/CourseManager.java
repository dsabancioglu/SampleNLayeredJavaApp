package business;

import dataAccess.ICourseDao;
import dataAccess.jdbc.JdbcCourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    ICourseDao courseDao;
    List<Course> courses;
    public CourseManager(ICourseDao courseDao, List<Course> courses){
        this.courseDao = courseDao ;
        this.courses = courses;
    }
    //1-- Kursun fiyatı 0'dan küçük olamaz
    //2-- Kurs ismi tekrar edemez
    public void add(Course course) throws Exception{

        if(course.getPrice() >= 0) {
            for (Course course1 : this.courses) {
                if(course1 == course) {
                    throw new Exception("Bu kurs adı sistemde kayıtlıdır.");
                }
            }
            this.courseDao.add(course);
            System.out.println("eklendi");
        }
        else {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
        }
    }
}
