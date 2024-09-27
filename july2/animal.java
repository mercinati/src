package july2;

public class animal {
    public static void main(String[] args) {
        dog d = new dog();

        d.bark();
        d.meow();
        d.breath();
    }
}

 class dog extends cat {
    void bark() {
        System.out.println("dog can barking");
    }
}

class cat extends livingBeing {
    void meow() {
        System.out.println("cat can meow");
    }
}

class livingBeing {
    void breath() {
        System.out.println("all can breath");
    }
}