package oopWithNLayeredCourseApp.entities;

public class Course {
    private String name;
    private int price;
    private Instructor instructor;
    private Category category;

    public Course(String name, int price, Instructor instructor, Category category) {
        this.name = name;
        this.price = price;
        this.instructor = instructor;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
