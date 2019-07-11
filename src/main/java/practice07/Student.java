package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age,Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("My name is Tom. I am %d years old. I am a Student. I am at Class %d.",this.getAge(),klass.getNumber());
    }
}
