package dataAccess.jdbc;

import dataAccess.IInstructorDao;
import entities.Category;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements IInstructorDao {
    private List<Instructor> instructors;

    public JdbcInstructorDao(){
        this.instructors = new ArrayList<Instructor>();
    }

    @Override
    public void add(Instructor instructor) {
        this.instructors.add(instructor);
        System.out.println("Eğitmenler Jdbc ile db'e eklendi ");
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
}
