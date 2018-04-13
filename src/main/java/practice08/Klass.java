package practice08;

public class Klass {
    private int number = 0;
    public Student leader;
    public Klass(int number){
        this.number = number ;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+getNumber();
    }
}
