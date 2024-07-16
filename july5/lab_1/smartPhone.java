package lab_1;

public class smartPhone extends device {
    int num;
    public void smartPhone(int num) {
        this.num = num;
    }
    public void display_sp() {
        System.out.println("this is smartPhone class");
    }

    public int phone(int num) {
        if(num==1) {
            System.out.println("my phone");
        }else if(num==2){
            System.out.println("your's phone");
        }else{
            System.out.println("someone else's phone");
        }
        return 0;
    }
}
