public class Main {
    public static void main(String[] args) {
        Interval i1 = new Interval(0, 100);
        Interval i2 = new Interval(50, 120);
        Interval i3 = new Interval(-20, -5);
        System.out.println("i1, i2: "+i1.isOverl(i2));
    }
}
