package oops;
class StudentDemo {
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks < 0) {
            this.marks = 0;
        } else if (marks > 100) {
            this.marks = 100;
        } else {
            this.marks = marks;
        }
    }
}

public class Student{
    public static void main(String[] args) {
        StudentDemo s = new StudentDemo();
        s.setName("Krishna");
        s.setRollNo(101);
        s.setMarks(120);  

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}
