package oopWithNLayeredCourseApp.dataAccess;

import oopWithNLayeredCourseApp.entities.Category;
import oopWithNLayeredCourseApp.entities.Course;
import oopWithNLayeredCourseApp.entities.Instructor;

public class CourseDao {
    public Category[] categories = new Category[3];
    public Instructor[] instructor = new Instructor[3];
    public Course[] courses = new Course[3];

    public CourseDao(){
        categories[0] = new Category("veritabani");
        categories[1] = new Category("oop");
        categories[2] = new Category("yapay zeka");

        instructor[0] = new Instructor("Resul", "Ozdemir");
        instructor[1] = new Instructor("Engin", "Demirog");
        instructor[2] = new Instructor("Ramazan", "Ozdemir");


        courses[0] = new Course("Resul ile veritabanı",100,instructor[0],categories[0]);

        courses[1] = new Course("Engin ile oop",200,instructor[1],categories[1]);

        courses[2] = new Course("Ramazan ile yapay zeka",150,instructor[2],categories[2]);
    }

    public Course get() throws IllegalStateException{
        for (Course cours : courses) {
            return cours;
        }

        throw new IllegalStateException("Kurslar mevcut değil!");
    }

    public void add(Course course) throws Exception {
        for (Course existingCourse : courses) {
            if (existingCourse != null && existingCourse.getName().equals(course.getName())) {
                throw new Exception("Kurs ismi eski kurs ismi ile aynı olamaz");
            }
            if (existingCourse != null && existingCourse.getCategory().equals(course.getCategory())) {
                throw new Exception("Kategori ismi aynı olamaz");
            }
        }
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return;
            }
        }
        throw new Exception("Kurs eklenemedi, veritabanı dolu!");
    }

}
