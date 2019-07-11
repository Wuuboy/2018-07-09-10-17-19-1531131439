package practice05;

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
        return String.format("My name is Tom. I am %d years old. I am a Student. I am at Class %d.",this.getAge(),classNumber);
    }
}
