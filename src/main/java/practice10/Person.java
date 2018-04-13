package practice10;

public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id,String name,int age){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person)obj;
            return person.getId() == this.id;
        }
        return false;
    }
}
