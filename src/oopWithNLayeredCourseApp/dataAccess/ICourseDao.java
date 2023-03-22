package oopWithNLayeredCourseApp.dataAccess;

import oopWithNLayeredCourseApp.entities.Course;

public interface ICourseDao {
     void add(Course course);
     Course get();
}
