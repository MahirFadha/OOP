package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Staff extends Employee{
    //konkret class, inheritence dari class Employee
    private String nama; //encapsulasi private
    private String ShiftKerja; //encapsulasi private
    private int gaji; //encapsulasi private

    protected Staff (int nik,String email,int idNum, String alamat, String nomorHp,String nama,String ShiftKerja,int gaji){
        //konstrktor Staff yang menuruni nilai nik,email,idNum,alamat dan nomorHp dari class Employee
        super(nik,email,idNum,alamat,nomorHp);
        this.nama = nama;
        this.ShiftKerja = ShiftKerja;
        this.gaji = gaji;
    }
    //method acessor
    protected String getNama() {
        return nama;
    }
    //method acessor
    protected String getShiftKerja() {
        return ShiftKerja;
    }
    //method acessor
    protected int getGaji(){
        return gaji;
    }
    //method acessor
    protected void gajian(){
        System.out.println("Gaji " + nama + " adalah: "+gaji);
    }
    //method acessor, override dari method rapat di class Employee
    protected void rapat(){
        System.out.println(nama + " sedang mengikuti rapat");
    }
}
