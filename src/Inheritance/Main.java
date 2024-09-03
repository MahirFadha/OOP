package Inheritance;

public class Main {
    public static void main(String[] args) {
        SepedaGunung sg = new SepedaGunung();

        System.out.println("Sepeda Gunung");
        sg.setGir(6);
        System.out.println(sg.getGir());
        sg.setSadel(2);
        System.out.println(sg.getSadel());

        System.out.println("Sepeda Balap");
        SepedaBalap sb = new SepedaBalap();
        sb.setGir(6);
        System.out.println(sb.getGir());
        sb.setSadel(3);
        System.out.println(sb.getSadel());

        System.out.println("Sepeda Tandem");
        SepedaTandem st = new SepedaTandem();
        st.setGir(3);
        System.out.println(st.getGir());
        st.setSadel(1);
        System.out.println(st.getSadel());
    }
}
