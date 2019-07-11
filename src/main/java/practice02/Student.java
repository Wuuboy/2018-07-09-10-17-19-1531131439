package practice02;

public class Student extends Person{
    private int classNumber ;


    public Student(String name, int age,int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %d.",this.getClassNumber());
    }
}
