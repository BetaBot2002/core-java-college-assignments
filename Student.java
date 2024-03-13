public class Student {
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(10, "Sinchan");
        System.out.println("Student 1 | ID: "+s1.id+", Name: "+s1.name);
        System.out.println("Student 2 | ID: "+s2.id+", Name: "+s2.name);
    }
}
