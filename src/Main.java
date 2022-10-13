import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.ConsoleLogger;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import dataAccess.ICategoryDao;
import dataAccess.ICourseDao;
import dataAccess.IInstructorDao;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        ICategoryDao categoryDao = new HibernateCategoryDao();
        ICourseDao courseDao = new HibernateCourseDao();
        IInstructorDao instructorDao = new HibernateInstructorDao();

        //loggers
        List<ILogger> loggers = new ArrayList<>();
        loggers.add(new ConsoleLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        //database
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Yazilim"));
        categories.add(new Category("Siyaset"));
        categories.add(new Category("Ekonomi"));
        categoryDao.setCategories(categories);

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java", 0));
        courses.add(new Course("C#", 100));
        courseDao.setCourses(courses);

        List<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Ahmet","Yıldız"));
        instructors.add(new Instructor("Mehmet","Yılmaz"));
        instructorDao.setInstructors(instructors);

        //will be added
        Category category = new Category("Tıp");
        Course course = new Course("C++", 10);
        Instructor instructor = new Instructor("Ayse", "Ak");

        //add if it fits the business rule, otherwise throws exception
        CategoryManager categoryManager = new CategoryManager(categoryDao, categories,loggers);
        categoryManager.add(category);
        InstructorManager instructorManager = new InstructorManager(instructorDao,loggers);
        instructorManager.add(instructor);
        CourseManager courseManager = new CourseManager(courseDao, courses, loggers);
        courseManager.add(course);

    }
}