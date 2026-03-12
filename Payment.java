package Task03;

public class Payment {
    public void processPayment(){
        System.out.println("Processing the payment");
    }

    public static void main(String[] args) {
        Payment cc = new CreditCard();
        Payment dc = new DebitCard();
        Payment pp = new PayPal();

        cc.processPayment();
        dc.processPayment();
        pp.processPayment();
    }
}

class CreditCard extends Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment is processed through your Credit Card");
    }
}

class DebitCard extends Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment is processed through your Debit Card");
    }
}

class PayPal extends Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment is processed through your PayPal account");
    }
}