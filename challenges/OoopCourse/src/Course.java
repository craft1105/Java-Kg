public class Course {
    static int MaxCapacity=10;

    String courseName;
    String [] enrolledStudents= new String [MaxCapacity];
int enrollment=0;
    boolean enrolled;

    public void enrollStudent(String studentName){
        if(enrolled){
            enrolledStudents[enrollment]= studentName;
            enrollment++;
            enrolled =false;
        }else{
            System.out.println("Student is already registered");
        }

    }
    public void unenrollStudent(String studentName){
        if(enrolled){
            System.out.println("please first register the student ");
        }else{
        enrolledStudents[enrollment]= studentName;
        enrolled = false;
            enrollment++;
        }

        }
    void setMaxCapacity(int capacity){
        MaxCapacity=capacity;
    }

    void MaxCapacity(){
        System.out.println(MaxCapacity);
    }

    public static void main(String[] args) {
        Course std = new Course();
        std.enrollStudent("sameer Ali");
        std.setMaxCapacity(5);
        std.MaxCapacity();
        std.enrollStudent("fahad");

    }

}
