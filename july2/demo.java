// Multilevel Inheritance Example

// Create a class Vehicle with a method drive()
//  that prints "The vehicle is driving". Create a subclass Car 
//  that extends Vehicle and adds a method honk(). 
//  Create another subclass SportsCar that extends Car 
//  and overrides the drive() method to print "The sports car is racing".

package july2;

public class demo {
    public static void main(String[] args) {
        sportsCar s = new sportsCar();
        
        s.drive();
    }
}

class vehicle {
    public void drive() {
        System.out.println("The vehicle is driving");
    }
}

class car extends vehicle {
    public void honk() {
        System.out.println("The vehicle is honking");
    }
}

class sportsCar extends car {
    public void drive() {
        System.out.println("The sports car is racing");
    }
}