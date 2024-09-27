public class employee {
    public static void main(String[] args) {
        
        Staff s1 = new Staff("karan","kg",45000,"DM");
        Staff s2 = new Staff("ajay","kg",45000,"DM");
        Staff s3 = new Staff("abbaas","kg",45000,"DM");

        s1.display();
        s2.display();
        s3.display();
    }
}

class Staff{
        String name;
        String id;
        int salary;
        String department;

    public Staff(String name, String id, int salary, String department){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.department=department;
    }

    void display(){
        System.out.println("name is :"+ name);
        System.out.println("Id is :"+ id);
        System.out.println("salary is :"+ salary);
        System.out.println("department is :"+ department);
    }
}