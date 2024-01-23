package constructor_static_final.com.cis;

public class FinalExample {
    final int num = 10;

    final void finalMethod() {
        System.out.println("This is a Final method");
    }
}

class Main {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        System.out.println("Final Variable = " + obj.num);

        obj.finalMethod();
    }
}
