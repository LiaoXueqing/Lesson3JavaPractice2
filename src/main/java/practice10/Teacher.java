package practice10;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private HashSet<Klass> classes = new HashSet<>();
    private final String JOB_INTRODUCE = " I am a Teacher.";
    public Teacher(int id,String name,int age,HashSet<Klass> classes){
        super(id,name,age);
        this.classes = classes;
    }
    public Teacher(int id,String name,int age){
        super(id,name,age);
    }
    private String myClassesName() {
        StringBuilder sb = new StringBuilder("Class ");
        this.classes.forEach(klass -> sb.append(klass.getNumber() + ", "));
        return sb.substring(0, sb.length() - 2);
    }
    public String introduce(){
        return super.introduce()+JOB_INTRODUCE+" I teach "+((this.classes==null || getClasses().size()==0)?"No Class.":""+ this.myClassesName() +".");
    }

    public String introduceWith(Student st) {
        if(isTeaching(st)){
            return super.introduce()+JOB_INTRODUCE+" I teach "+st.getName()+".";
        }
        return super.introduce()+JOB_INTRODUCE+" I don't teach "+st.getName()+".";
    }
    public boolean isTeaching(Student student){
        return this.classes.stream().filter(klass -> klass.isIn(student)).collect(Collectors.toSet()).size() > 0;
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public void setClasses(HashSet<Klass> classes) {
        this.classes = classes;
    }
}
