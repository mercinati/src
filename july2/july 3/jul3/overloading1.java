package jul3;

public class overloading1 {
    public static void main(String[] args) {
        bankaccount ba = new bankaccount();

        ba.deposit(550.7,10.5);
    }
}

class bankaccount {
    double amt, amount, rate;
    double deposit(double amt) {
        this.amt = amt;
        System.out.println("this method returns 1 parameter"+ amt);
        System.out.println("your amount is = "+amt);
        return 0;
    }

    double deposit(double amount , double rate) {
        this.amount = amount;
        this.rate = rate;
        System.out.println("this method returns 2 parameter "+ amount+","+rate+"%");
        System.out.println("your amount is = "+amount+" rate of interest is = "+rate+"%");
        return 0;
    }
}