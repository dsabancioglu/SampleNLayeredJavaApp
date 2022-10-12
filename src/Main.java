import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.ICategoryDao;
import dataAccess.ICourseDao;
import dataAccess.IInstructorDao;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import dataAccess.jdbc.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ICategoryDao categoryDao = new HibernateCategoryDao();
        ICourseDao courseDao = new HibernateCourseDao();
        IInstructorDao instructorDao = new HibernateInstructorDao();

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

        //eklenecekler
        Category category = new Category("Tıp");
        Course course = new Course("C++", 10);
        Instructor instructor = new Instructor("Ayse", "Ak");

        //iş kuralına uyuyorsa ekle
        CategoryManager categoryManager = new CategoryManager(categoryDao, categories);
        categoryManager.add(category);
        InstructorManager instructorManager = new InstructorManager(instructorDao);
        instructorManager.add(instructor);
        CourseManager courseManager = new CourseManager(courseDao, courses);
        courseManager.add(course);

    }
}