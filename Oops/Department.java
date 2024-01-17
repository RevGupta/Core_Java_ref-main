abstract class Department {

    public abstract int getDepartmenSize();
}

class SubDepartment extends Department {
    int departmentSize = 20;

    public int getDepartmenSize() {
        return departmentSize;
    }

    public static void main(String[] args) {
        SubDepartment obj = new SubDepartment();
        int size = obj.getDepartmenSize();
        System.out.println("Department Size = " + size);
    }
}
