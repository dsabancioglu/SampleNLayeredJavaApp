package dataAccess.hibernate;

import dataAccess.IInstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateInstructorDao implements IInstructorDao {
    private List<Instructor> instructors;

    public HibernateInstructorDao(){
        this.setInstructors(new ArrayList<Instructor>());
    }

    @Override
    public void add(Instructor instructor) {  //SQL
        this.instructors.add(instructor);
        System.out.println("Eğitmenler Hibernate ile db'e eklendi " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }
    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
}
