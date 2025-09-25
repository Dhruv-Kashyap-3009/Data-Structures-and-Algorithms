//Use of static keyword

class Example3{
    public static class Student{
        String name;
        int rno;
        double percentage;
        static int numberOfStudents;
        //If we not use static keyword then numberOfStudents will be dependent on the object and return 1 everytime.

        public Student(String name, int rno, double percentage){               // Constructor
            this.name=name;
            this.rno=rno;
            this.percentage=percentage;
            numberOfStudents++;
        }
    }

    public static void main(String[] args) {
        Student s1=new Student("Dhruv", 28, 90.5);

        System.out.println(s1.numberOfStudents);

        Student s2=new Student("Akshat Khan", 20, 70.5);

        System.out.println(s2.numberOfStudents);
    }
}