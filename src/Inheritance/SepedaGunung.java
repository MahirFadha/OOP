package Inheritance;

public class SepedaGunung extends Sepeda{
    private int sadel;

    void setSadel(int Jumlah) {
        sadel = getGir() - Jumlah;
    }

    int getSadel(){
        return sadel;
    }
}
