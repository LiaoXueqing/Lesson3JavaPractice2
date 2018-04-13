package practice11;

import java.util.LinkedList;

public class Klass {
    private int number = 0;
    public Student leader;
    private LinkedList<Teacher> teachers = new LinkedList<>();

    public Klass(int number){
        this.number = number ;
    }

    public void appendMember(Student student){
        student.setKlass(this);
        this.teachers.forEach(teacher -> teacher.knowAboutJoin(student, this));
    }
    public boolean isIn(Student student){
        return student.getKlass().equals(this);
    }
    public String getDisplayName(){
        return "Class "+getNumber();
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void assignLeader(Student student){
        if (!student.getKlass().equals(this)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        this.teachers.forEach(teacher -> teacher.knowAboutLeader(student, this));
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
