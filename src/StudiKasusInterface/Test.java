package StudiKasusInterface;

public class Test {
    public static void main(String[] args) {
        CheckoutShopee S = new CheckoutShopee();
        S.proses();
        S.pesan();

        CheckoutTokped T = new CheckoutTokped();
        T.pesan();
        T.proses();
    }
}
