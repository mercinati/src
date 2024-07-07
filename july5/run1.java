package july5;

public class run1 {
    public static void main(String[] args) {
        printable d = new document("Karan Gupta");
        printable i = new image(10, 20);
        d.print();
        i.print();
    }
}
