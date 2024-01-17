public class StatExample {
    static int num;

    static int getStaticVariable() {
        return num;
    }

    public static void main(String[] args) {

        StatExample.num = 10;

        int var = StatExample.getStaticVariable();

        System.out.println("Static Variable = " + num);
        System.out.println("Static Method = " + var);

    }
}
