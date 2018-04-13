package practice11;

public class Student extends Person{
    private Klass klass;
    public Student(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass = klass;
    }
    public String introduce(){
        return super.introduce()+" I am a Student. I am "
                +((this==klass.getLeader())?"Leader of "+klass.getDisplayName()+".":"at "+klass.getDisplayName()+".");
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
