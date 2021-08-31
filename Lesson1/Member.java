package Lesson1;

public class Member {

    public String name;
    public String secondName;
    public int height;
    public int age;

    public Member(String name, String secondName, int height, int age) {
        this.name = name;
        this.secondName = secondName;
        this.height = height;
        this.age = age;
    }

    public String getInfo() {
        return  this.name + " " +
                this.secondName + ", Рост: " +
                this.height + ", Возраст: " +
                this.age + " лет.";
    }



}



