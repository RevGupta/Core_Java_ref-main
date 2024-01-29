package maps;

import java.util.HashMap;

public class StudentMap {
    private HashMap<String, Student> studentMap;

    public StudentMap() {
        studentMap = new HashMap<>();
        initializeMap();
    }

    private void initializeMap() {
        // Creating 8 student objects and putting them into the map
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Alice", new Student("Alice", "Smith", 3.8));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.9));
        studentMap.put("Emily", new Student("Emily", "Williams", 3.7));
        studentMap.put("David", new Student("David", "Brown", 3.6));
        studentMap.put("Sarah", new Student("Sarah", "Jones", 3.4));
        studentMap.put("Michael", new Student("Michael", "Davis", 3.2));
        studentMap.put("Emma", new Student("Emma", "Wilson", 3.3));
    }

    public Student getStudent(String firstName) {
        return studentMap.get(firstName);
    }
}
