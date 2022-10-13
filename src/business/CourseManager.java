package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    ICourseDao courseDao;
    List<Course> courses;
    List<ILogger> loggers;

    public CourseManager(ICourseDao courseDao, List<Course> courses, List<ILogger> loggers){
        this.courseDao = courseDao ;
        this.courses = courses;
        this.loggers = loggers;
    }

    //Requirement1-- Kursun fiyatı 0'dan küçük olamaz
    //Requirement2-- Kurs ismi tekrar edemez
    public void add(Course course) throws Exception{

        if(course.getPrice() >= 0) {
            for (Course course1 : this.courses) {
                if(course1.getName().equals(course.getName())) {
                    throw new Exception("Bu kurs adı sistemde kayıtlıdır.");
                }
            }
            this.courseDao.add(course);
            for(ILogger logger: loggers){
                logger.log("Yeni kurs eklendi: "+ course.getName());
            }
        }
        else {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
        }
    }
}
