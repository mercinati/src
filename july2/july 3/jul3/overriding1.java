package jul3;

public class overriding1 {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.sound();
        c.sound();
    }
}

class animal {
    void sound() {
        System.out.println("all animal produce sound");
    }
}

class dog extends animal {
    void sound() {
        System.out.println("dog use to bark");
        super.sound();
    }
}

class cat extends animal {
    void sound() {
        System.out.println("cat use to meow");
        super.sound();
    }
}