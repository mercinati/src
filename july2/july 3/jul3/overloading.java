// Question 1:

// Write a Java program to demonstrate method 
// overloading by creating a Calculator 
// class with three calculateArea methods: 
// one that takes a single double parameter 
// (radius) for calculating the area of a circle,
// one that takes two double parameters (length and width) 
// for calculating the area of a rectangle, and one that takes
// three double parameters (base, height, and width) 
// for calculating the area of a triangle.
 
package jul3;

public class overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println( c.calculateArea(5.0,5.0, 5.0));
    }
}

class Calculator {
    double r, l, b, h1, w1, b1;
    double calculateArea (double r) {
        this.r=r;
        System.out.println("area of circle =");
        return (3.14*r*r);
    }

    double calculateArea(double l , double w ) {
        this.l=l;
        this.b=b;
        System.out.println("area of rectangle =");
        return (l*b);
    }

    double calculateArea(double h1 , double w1 , double b1 ) {
        this.h1=h1;
        this.w1=w1;
        this.b1=b1;
        System.out.println("area of triangle =");
        return(h1*w1*b1);
    }
}