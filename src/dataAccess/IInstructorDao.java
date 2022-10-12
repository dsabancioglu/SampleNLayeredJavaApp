package dataAccess;

import entities.Instructor;

import java.util.List;

public interface IInstructorDao {
    void add(Instructor instructor);
    List<Instructor> getInstructors();
    void setInstructors(List<Instructor> instructors);
}
