// Interface wale question..!!

package july5;

public interface printable {
    public void print();
    
}

class document implements printable {
    String txt;
    public document(String txt) {
        this.txt = txt;
    }
    public void print() {
        System.out.println("text field is: "+txt);
    }
}

class image implements printable {
    int w, h;
    public image(int h, int w) {
        this.w = w;
        this.h = h;
    }
    public void print() {
        System.out.println("height is: "+h+", width is: "+w);
    }
}
