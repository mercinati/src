import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int marks;

        System.out.println("Enter marks of student out of 100: ");
        int marks = scanner.nextInt();

        switch(marks)
        {
            case 1:
            {
                if(marks<=100 || marks>=90)
                System.out.println("grade is A");
                break;
            }
            case 2:
            {
                if(marks<=89 || marks>=80)
                System.out.println("grade is B");
                break;
            }
            case 3:
            {
                if(marks<=79 || marks>=70)
                System.out.println("grade is C");
                break;
            }
            case 4:
            {
                if(marks<=69 || marks>=60)
                System.out.println("grade is D");
                break;
            }
            default:
            {
                System.out.println("FAIL");
            }
        }
    }
}
