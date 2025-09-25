//Classes are Blueprint
//Object are real world entity. Objects are instance of class.

class Example1{
    public static class Student{               //Creating Data Type(class)
        String name;
        int rollno;
        double percentage;
    }

    public static void main(String[] args) {
        Student s1=new Student();         //Creating object as s1
        s1.name="Dhruv Kashyap";
        s1.rollno=28;
        s1.percentage=90.5;

        Student s2=new Student();         //Creating object as s2
        s2.name="Akshat Khan";
        s2.rollno=20;
        s2.percentage=70.5;

        System.out.println("Details of Student 1: ");
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.percentage);

        System.out.println("Details of Student 2: ");
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.percentage);
    }
}