package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Alumnus extends CommunityMember{
    //konkret class, inheritence dari class CommunityMember
    protected String nama; //Encapsulasi protected
    protected String major; //Encapsulasi protected
    protected int nim ; //Encapsulasi protected
    protected double ipk ; //Encapsulasi protected

    //konstrktor Alumnus yang menuruni nilai nik dan email dari class CommunityMembers
    protected Alumnus(int nik,String email,String nama,String major,int nim,double ipk){
        super(nik,email);
        this.nama = nama;
        this.major = major;
        this.nim = nim;
        this.ipk = ipk;
    }
    //Method acessor
    protected String getNama(){
        return nama;
    }
    //Method acessor
    protected String getMajor() {
        return major;
    }
    //Method acessor
    protected int getNim() {
        return nim;
    }
    //Method acessor
    double getIpk() {
        return ipk;
    }
    //Method acessor
    protected void reuni(){
        System.out.println("Alumnus mengadakan reuni besar");
    }
    //Method acessor
    protected void keKampus(){
        System.out.println(nama + " Datang kekampus");
    }
    //method acessor, override dari method acara pada class CommunityMember
    protected void acara() {
        System.out.println(nama + " menghadiri acara komunitas");
    }

}
