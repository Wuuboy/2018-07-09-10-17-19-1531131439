package practice07;

public class Teacher extends Person{
    private Klass klass;
    private Student student;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name,age);
    }
    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass!=null){
            return String.format("My name is Tom. I am %d years old. I am a Teacher. I teach Class %d.",this.getAge(),klass.getNumber());
        }else {
            return String.format("My name is Tom. I am %d years old. I am a Teacher. I teach No Class.",this.getAge());
        }
    }

    public String introduceWith(Student student) {
        if (klass.getNumber()==student.getKlass().getNumber()){
            return String.format("My name is Tom. I am %d years old. I am a Teacher. I teach %s.",this.getAge(),student.getName());
        }else {
            return String.format("My name is Tom. I am %d years old. I am a Teacher. I don't teach %s.",this.getAge(),student.getName());
        }
    }
}
