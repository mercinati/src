package july5;

public class run2 {
    public static void main(String[] args) {
        paymentMethod c_card = new creditCard(1234567, "5july2024");
        paymentMethod pp = new paypal("xyz@email.com", 1234567, "5july2024");
        c_card.pay();
        c_card.getPaymentDetails();
        pp.pay();
        pp.getPaymentDetails();
        // paypal pp1 =new paypal ();
    }
}
