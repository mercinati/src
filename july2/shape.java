// Hierarchical Inheritance Example

// Create a class Shape with a method area() that returns 0. 
// Create two subclasses Circle 
// and Rectangle that extend Shape and implement their own area() methods.

package july2;

public class shape {
    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();

        c.area();
        r.area();
    }
}

class figure {
    public void area() {
        System.out.println("this is figure");
    }
}

class circle extends figure {
    public void area() {
        System.out.println("this is circle");
    }
}

class rectangle extends figure {
    public void area() {
        System.out.println("this is rectangle");
    }
}