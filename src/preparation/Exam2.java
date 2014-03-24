package preparation;

public class Exam2 {
    static volatile int omg = 0;

    static class B extends Exam2 {
    }

    public static void main(String args[]) {
        Exam2 p1 = new Exam2();
        Exam2 p2 = new B();
        B p3 = new B();
        p1 = p3;
        p2 = (Exam2) p3;
        p3 = (B) p2;
    }
}
