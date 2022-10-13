package business;

import core.logging.ILogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    public IInstructorDao instructorDao;
    List<ILogger> loggers;

    public InstructorManager(IInstructorDao instructorDao, List<ILogger> loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        this.instructorDao.add(instructor);
        for (ILogger logger: loggers){
            logger.log("Yeni eğitmen eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
        }
    }

}
