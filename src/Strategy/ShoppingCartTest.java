package Strategy;

public class ShoppingCartTest {
    public static void main(String args[]){
            ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addItem(new Item("1234",10));
        shoppingCart.addItem(new Item("5678",40));
        shoppingCart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        shoppingCart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
    }
}
