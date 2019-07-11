package practice06;

public class Teacher extends Person{
    private int classNumber ;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public String introduce() {
        //I do not know how to verify which constuct function is used by codes,another way I do not know how to write the condition in 'if'
        if (classNumber!=0){
            return String.format("My name is Tom. I am %d years old. I am a Teacher. I teach Class %d.",this.getAge(),classNumber);
        }else {
            return String.format("My name is Tom. I am %d years old. I am a Teacher. I teach No Class.",this.getAge());
        }
    }

}
