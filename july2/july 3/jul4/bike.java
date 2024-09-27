// Bike is an abstract class that contains only one abstract method run
// and it has on concrete method bikeBody()  and this method is showing body of bike.
// Its implementation is provided by the Honda class. and create object and check 
// how it is working

package jul4;

public abstract class bike {
    abstract void run();

    void bikeBody() {
        System.out.println("this is bike body");
    }
}
