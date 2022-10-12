package business;

import dataAccess.IInstructorDao;
import dataAccess.hibernate.HibernateInstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    public IInstructorDao instructorDao;
    public InstructorManager(IInstructorDao instructorDao){
        this.instructorDao = instructorDao;
    }
    public void add(Instructor instructor){
        this.instructorDao.add(instructor);
    }

}
