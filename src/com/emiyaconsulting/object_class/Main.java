package com.emiyaconsulting.object_class;

public class Main extends Object {
    public static void main(String[] args) {
        Student madison = new Student("Madison", 18);
        System.out.println(madison.toString());
        Student madi = madison;
        System.out.println(madi.toString());
        madi.setName("Madison Zirui Ranf");
        System.out.println(madison.getName());
        System.out.println(madi.getName());
        System.out.println(madi.hashCode());
        System.out.println(madison.hashCode());
        System.out.println(madi);
        System.out.println(madison);

        PrimarySchoolStudent mei = new PrimarySchoolStudent("Mei", 13, "Rob and Jen");
        System.out.println(mei);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}
