
class Parent {
    int parentVariable;

    public Parent(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}

class Child extends Parent {
    int childVariable;

    public Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super(0);
        this.childVariable = childVariable;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Child obj1 = new Child(10, 20);

        // Creating an instance of Child with only the child class instance variable
        // initialized
        Child obj2 = new Child(30);

        // Printing the values
        System.out.println("Child with both variables: ParentVariable=" + obj1.parentVariable
                + ", ChildVariable=" + obj1.childVariable);

        System.out.println("Child with child variable only: ParentVariable=" + obj2.parentVariable + ", ChildVariable="
                + obj2.childVariable);
    }
}
