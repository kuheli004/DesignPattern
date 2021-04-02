package Strategy;

public class CreditCardStrategy implements  PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    public CreditCardStrategy(String name,String cardNumber,String cvv,String dataOfExp){
        this.name=name;
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.dateOfExpiry=dataOfExp;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paying with credit card");
    }
}
