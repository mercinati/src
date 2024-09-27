// _ _ _ _ 0
// _ _ _ 0 1
// _ _ 0 1 2
// _ 0 1 2 3
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any no. : ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("_ ");
            }
            for(int k=i; k>=0; k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}