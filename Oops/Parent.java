public class Parent {
    void message() {
        System.out.println("This is a Parent class method");
    }
}

class Child extends Parent {
    void message() {
        System.out.println("This is a Child class method");
    }
}

class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.message();
        Child obj2 = new Child();
        obj2.message();
    }
}
