package StudiKasusAbstrak;

public class BarangKecil extends Checkout{
    public void cekbarang(int barang){
        paket(barang);
        System.out.println("Paket dalam proses pembungkusan");
    }
}
