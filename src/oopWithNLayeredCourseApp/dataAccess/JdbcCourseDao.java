package oopWithNLayeredCourseApp.dataAccess;

import oopWithNLayeredCourseApp.entities.Course;

public class JdbcCourseDao extends CourseDao implements ICourseDao{

    CourseDao courseDao = new CourseDao();
    @Override
    public void add(Course course){
        //veritabına eklenme kodları
        System.out.println("Jdbc ile veritabanıa eklendi");
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
