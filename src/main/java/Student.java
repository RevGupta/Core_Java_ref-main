public class Student {
    String name;

    String getName() {
        return this.name;
    }

    Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj = new Student("Revanth");
        System.out.println(obj.getName());

    }
}
