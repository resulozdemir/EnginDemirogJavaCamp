package oopWithNLayeredCourseApp.dataAccess;

import oopWithNLayeredCourseApp.entities.Course;

public class JdbcCourseDao  implements ICourseDao{

    @Override
    public void add(Course course){
        //veritabına eklenme kodları
        System.out.println("Jdbc ile veritabanıa eklendi");
    }

}
