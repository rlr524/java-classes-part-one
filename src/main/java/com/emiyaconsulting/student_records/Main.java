package com.emiyaconsulting.student_records;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // Converting i to a String is not necessary as Java will coerce i from an int to a String
            // when you concatenate them using the + operator or within string interpolation. In my opinion,
            // however it creates clearer, safer code.
            String id = String.valueOf(i);
            String[] studentsFirst = new String[] {"Madison", "Olivia", "Nicole", "Mei", "Jen"};
            String[] studentsLast = new String[] {"Ranf", "Rodrigo", "Leano", "Ranf", "Tsai"};

            Student student = new Student("S92300" + id, studentsLast[i], studentsFirst[i],
                    "01022008", "9"
                    );

            RecordStudent recStudent = new RecordStudent("R1115" + id, studentsLast[i], studentsFirst[i],
                    "01022008", "9");

            // There are no mutators (setters) on the record type, only accessors (getters). You access any
            // field by the built-in accessor method which is simply the name of the field with ().
            System.out.println(recStudent.classLevel());

            // The toString override method inside the class allows testing by returning the object values
            // to strings, and it is called simply by passing the object reference identifier. The toString() method
            // is available on the Object() class, which is inherited by all classes as the root of the class
            // hierarchy. In order to use it, it must be explicitly defined in the class as an override method.
            System.out.println("********************* Class Student ******************");
            System.out.println(student);

            System.out.println("****************** Record Student **************************");
            // The Java record even includes the toString method without you needed to explicitly write it.
            System.out.println(recStudent);
        }

        int age = 18;
        String name = "Madison";
        System.out.println(age + " " + name);
        System.out.printf("My name is %s and I am %d-years-old\n", name, age);
    }
}
