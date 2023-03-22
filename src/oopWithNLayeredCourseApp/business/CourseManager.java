package oopWithNLayeredCourseApp.business;

import oopWithNLayeredCourseApp.core.logging.ILogger;
import oopWithNLayeredCourseApp.dataAccess.CourseDao;
import oopWithNLayeredCourseApp.dataAccess.ICourseDao;
import oopWithNLayeredCourseApp.entities.Course;

public class CourseManager {
    private ICourseDao iCourseDao;
    private ILogger[] iLogger;

    private CourseDao courseDao;

    public CourseManager(ICourseDao iCourseDao, ILogger[] iLogger) {
        this.iCourseDao = iCourseDao;
        this.iLogger = iLogger;
    }

    public void add(Course course) throws Exception{

        if(course.getPrice() < 0){
            throw new Exception("Kurs fiyatı sıfırdan küçük olamaz");
        }





        iCourseDao.add(course);

        for(ILogger logger : iLogger){
            logger.log(course.getName());
        }



    }

}
