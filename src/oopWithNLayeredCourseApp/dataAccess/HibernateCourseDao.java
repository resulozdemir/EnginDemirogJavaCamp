package oopWithNLayeredCourseApp.dataAccess;

import oopWithNLayeredCourseApp.entities.Course;

public class HibernateCourseDao extends CourseDao implements ICourseDao{
    CourseDao courseDao = new CourseDao();
    @Override
    public void add(Course course){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    @Override
    public Course get() throws IllegalStateException{
        //veritabanından kursları çekme kodu

        for(int i = 0;i< courses.length;i++){
            courseDao.get();
        }

        throw new IllegalStateException("Kurslar mevcut değil!");
    }
}
