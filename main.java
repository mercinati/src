public class main{
    public static void main(String[] args) {
        student ob1 = new student("sigma", "1035 near sigma gali", "BCA");
        student ob2 = new student("betaa", "1036 near betaa gali", "BCA");
        student ob3 = new student("lamda", "1037 near lamda gali", "BCA");
        student ob4 = new student("gaamd", "1038 near gaamd gali", "BCA");
        student ob5 = new student("alfaa", "1039 near alfaa gali", "BCA");

        ob1.display();
        ob1.study();

        ob2.display();
        ob2.study();

        ob3.display();
        ob3.study();

        ob4.display();
        ob4.study();

        ob5.display();
        ob5.study();
    }
}

class student {
    String name;
    String add;
    String sub;
    
    public student(String n, String a, String s)
    {
        name = n;
        add = a;
        sub = s;
    }

    public void display()
    {
        System.out.println("name = "+ name);
        System.out.println("address = "+ add);
        System.out.println("subject = "+ sub);
    }

    public void study()
    {
        System.out.println(name+" is studying in "+sub);
    }
}
