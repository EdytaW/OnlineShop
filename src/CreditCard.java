public class CreditCard implements PaymentStrategy {

    public CreditCard(int number, int code,int datedd,int datemm, int dateyyyy) {
        this.number = number;
        this.code = code;
        this.datedd=datedd;
        this.datemm=datemm;
        this.dateyyyy=dateyyyy;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pay via Credit Card here using Card number"+" "+
                number+" "+ "CVV2"+" "+ code+" "+"expiration date"+" "+ datedd+"."+datemm+"."+dateyyyy);
    }

    private int number;
    private int code;
    private int datedd;
    private int datemm;
    private int dateyyyy;
}


