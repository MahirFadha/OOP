package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Administrator extends Faculty{
    //konkret class, inheritence dari class Faculty
    private String nama; //encapsulasi private
    private String bagian; //encapsulasi private

    protected Administrator(int nik,String email,int idEmp, String alamat, String nomorHp,int nip,String bidangKeahlian,String nama,String bagian){
        //konstrktor Administrator yang menuruni nilai nik,email,idNum,alamat,nomorHp,nip dan bidang keahlian dari class Faculty
        super(nik, email, idEmp, alamat, nomorHp, nip, bidangKeahlian);
        this.nama = nama;
        this.bagian = bagian;
    }
    //method acessor
    protected String getNama(){
        return nama;
    }
    //method acessor
    protected String getBagian(){
        return bagian;
    }
    //method acessor
    protected void arsip(){
        System.out.println("Bapak " + nama + " Mengarsip dan merekap data yang masuk");
    }
}
