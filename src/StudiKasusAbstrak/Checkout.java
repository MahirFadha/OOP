package StudiKasusAbstrak;

public abstract class Checkout {
    void paket(int barang) {
        if (barang > 100) {
            System.out.println("Pengiriman menggunakan kardus");
        } else {
            System.out.println("Pengiriman menggunakan bubblewrap");
        }
    }
    abstract void cekbarang(int barang);
    void otw() {
        System.out.println("Paket dalam pengantaran");
    }
}
