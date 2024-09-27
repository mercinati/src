public class MainClass {
    public static void main(String[] args) {
        student ob1 = new student();
        student ob2 = new student();
        student ob3 = new student();
        student ob4 = new student();
        student ob5 = new student();

        ob1.display(); ob1.study();
        ob2.display(); ob2.study();
        ob3.display(); ob3.study();
        ob4.display(); ob4.study();
        ob4.display(); ob5.study();
    }
}

class student
{
    String name = "sigma"; 
    String add = "1038"; 
    String sub = "BCA";
    
    void display()
    {
        System.out.println("Name = "+ name);
        System.out.println("Address = "+ add);
        System.out.println("Subject = "+ sub);
    }
    void study()
    {
        System.out.println("studying BCA");
    }
}
