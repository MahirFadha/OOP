package StudiKasusInterface;

public class CheckoutShopee implements Checkout {
    public void pesan(){
        System.out.println("Pesanan sedang dalam perjalanan (Shopee Express)");
    }

    @Override
    public void proses() {
        System.out.println("Pesanan sedang dalam proses (Shopee Express)");
    }
}
