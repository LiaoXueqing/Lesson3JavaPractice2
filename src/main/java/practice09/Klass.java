package practice09;

public class Klass {
    private int number = 0;
    public Student leader;
    public Klass(int number){
        this.number = number ;
    }
    public String getDisplayName(){
        return "Class "+getNumber();
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }
    public void assignLeader(Student student){
        if (!student.getKlass().equals(this)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
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
