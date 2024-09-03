package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Faculty extends Employee{
    //konkret class, inheritence dari class Employee
    private int nip; //encapsulasi private
    private String bidangKeahlian; //encapsulasi private

    protected Faculty(int nik,String email,int idEmp, String alamat, String nomorHp,int nip,String bidangKeahlian) {
        //konstrktor Faculty yang menuruni nilai nik,email,idNum,alamat dan nomorHp dari class Employee
        super(nik,email,idEmp,alamat,nomorHp);
        this.nip = nip;
        this.bidangKeahlian = bidangKeahlian;
    }
    //method acessor
    protected int getNip(){
        return nip;
    }
    //method acessor
    protected String getBidangKeahlian(){
        return bidangKeahlian;
    }
    //method acessor
    protected void tes(){
        System.out.println("Fakultas mengadakan tes");
    }
}
