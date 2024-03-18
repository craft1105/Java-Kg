public class StudentToString {
    String name;

    int age;

    public StudentToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student details:{name:"+name+" ,age:"+age+"}";
    }

    public static void main(String[] args) {
        StudentToString stu =new StudentToString("sameer",24);
        System.out.println(stu);
    }
}
