// Initializing class with Constructor

class Example2{
    public static class Student{
        String name;
        int rno;
        double percentage;
        final String schoolName="Christ Church College";;                 //School name cannot be changed due to final keyword.

        public Student(String name, int rno, double percentage){               // Constructor
            this.name=name;
            this.rno=rno;
            this.percentage=percentage;
        }
    }

    public static void main(String[] args) {
        Student s1=new Student("Dhruv", 28, 90.5);
        System.out.println("Details of Student 1: ");
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percentage);

        Student s2=new Student("Akshat Khan", 20, 70.5);
        System.out.println("Details of Student 2: ");
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percentage);
    }
}