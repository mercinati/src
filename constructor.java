import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two no.s : ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        marks m = new marks();

        m.anjali();
        System.out.println("product is "+m.marks(num_1,num_2));
        System.out.println("addition is "+m.add(num_1,num_2));
    }
    
}

class marks {
    int x,y,i,j;
    public int marks(int m, int n) 
    {
        i=m;
        j=n;
        System.out.println("this is constructor");
        return(i*j);
    }

    public void anjali() {
        System.out.println("this is anjali");
    }

    public int add(int a, int b) {
        x=a;
        y=b;
        return (x+y);
    }
}