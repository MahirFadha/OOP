package Inheritance;

public class SepedaTandem extends Sepeda{
    private int sadel;

    void setSadel(int Jumlah) {
        sadel = getGir()-Jumlah;
    }
    int getSadel() {
        return sadel;
    }
}
