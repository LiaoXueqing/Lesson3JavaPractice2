package practice07;

public class Teacher extends Person{
    private Klass klass;
    private final String JOB_INTRODUCE = " I am a Teacher.";
    public Teacher(String name,int age,Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public String introduce(){
        return super.introduce()+JOB_INTRODUCE+" I teach "+(klass==null?"No Class.":""+klass.getDisplayName()+".");
    }

    public String introduceWith(Student st) {
        return super.introduce()+JOB_INTRODUCE+(st.getKlass().getNumber()==getKlass().getNumber()?" I teach "+st.getName()+".":" I don't teach "+st.getName()+".");
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
