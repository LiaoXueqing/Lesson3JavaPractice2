package practice06;

public class Teacher extends Person{
    private int klass=0;
    public Teacher(String name,int age,int klass){
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public String introduce(){
        return super.introduce()+" I am a Teacher. I teach "+(klass==0?"No Class.":"Class "+getKlass()+".");
    }
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
