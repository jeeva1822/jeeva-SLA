package pack1;

class person{
    
    protected String name;
    protected int Age;
    
    public person(String name,int Age)
    {
        this.name=name;
        this.Age=Age;
    }
    
    
    public void display()
    {
        System.out.println("Name is :"+" "+name+" and Age is :"+" "+Age);
    }
}

class Student extends person{
    
    private int StudId;
    private String CourseName;

    Student(String name, int Age, int studentId, String course) {
        super(name, Age);
        this.StudId = studentId;
        this.CourseName = course;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Student ID is :"+" "+StudId+" Course Name is :"+" "+CourseName);
    }
}

class Teacher extends person{
    
    private int EmpId;
    private String SubjectName;

    Teacher(String name, int Age, int employeeId, String subject) {
        super(name, Age);
        this.EmpId = employeeId;
        this.SubjectName = subject;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Employee ID is :"+" "+EmpId+" Subject Name is :"+" "+SubjectName);
    }
}

public class InheritanceTask {

    public static void main(String[] args) {

        Student student = new Student("jeeva", 21, 87878, "java");
        student.display();
        
        Teacher teacher = new Teacher("meerut", 20, 9388, "python");
        System.out.println(teacher.Age);
    }
}

