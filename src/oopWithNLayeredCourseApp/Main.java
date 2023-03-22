package oopWithNLayeredCourseApp;

import oopWithNLayeredCourseApp.business.CourseManager;
import oopWithNLayeredCourseApp.core.logging.DatabaseLogger;
import oopWithNLayeredCourseApp.core.logging.FileLogger;
import oopWithNLayeredCourseApp.core.logging.ILogger;
import oopWithNLayeredCourseApp.core.logging.MailLogger;
import oopWithNLayeredCourseApp.dataAccess.HibernateCourseDao;
import oopWithNLayeredCourseApp.entities.Category;
import oopWithNLayeredCourseApp.entities.Course;
import oopWithNLayeredCourseApp.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};

        Course c1 = new Course("Ben ile C#",170,new Instructor("Resul","ozdemir"),new Category("nesne yonelimli"));
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(c1);
    }
}
