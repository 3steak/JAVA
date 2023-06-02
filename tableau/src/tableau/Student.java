package Tableau;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sayHello() {
        return "Bonjour je suis " + this.name;
    }
}
