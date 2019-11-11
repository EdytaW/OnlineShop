public class PayPal implements PaymentStrategy{

    public PayPal(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pay via PayPal here using email "+ email+" "
                + "pass "+ pass);

    }
    private String email;
    private String pass;
}
