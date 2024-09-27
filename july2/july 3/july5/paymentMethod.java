// Interface wale question..!!

package july5;

public interface paymentMethod {
    public void pay();
    public void getPaymentDetails();
}

class creditCard implements paymentMethod {
    long CN;String date;
    public creditCard(long CN,String date) {
        this.CN = CN;
        this.date = date;
    }
    public void pay() {
        System.out.println("you are payying to Karan");
    }
    public void getPaymentDetails() {
        System.out.println("your payment details are: card no. :"+CN+", Expiring on:"+date);
    }
}

class paypal implements paymentMethod {
    String e_mail;
    long CN;String date;
    public paypal(String e_mail,long CN,String date) {
        this.e_mail= e_mail;
        this.CN = CN;
        this.date = date;
    }
    public void pay() {
        System.out.println("you are payying to Karan");
    }
    public void getPaymentDetails() {
        System.out.println("your payment details are: card no. :"+CN+", Expiring on:"+date+", your E-mail is: "+e_mail);
    }
}