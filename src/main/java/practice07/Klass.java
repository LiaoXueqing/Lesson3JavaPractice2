package practice07;

public class Klass {
    int number = 0;

    public Klass(int number){
        this.number = number ;
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
