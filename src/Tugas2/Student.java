package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Student extends CommunityMember{
    //konkret class, inheritence dari class CommunityMember
    protected String nama; //Encapsulasi protected
    protected String Major; //Encapsulasi protected
    protected int Semt; //Encapsulasi protected
    protected String nim; //Encapsulasi protected

    //konstrktor Student yang menuruni nilai nik dan email dari class CommunityMembers
    protected Student(int nik,String email,String nama,String nim,String Major,int Semt){
        super(nik,email);
        this.nama = nama;
        this.nim=nim;
        this.Major=Major;
        this.Semt=Semt;
    }
    //method acessor
    protected String getNama(){
        return this.nama;
    }
    //method acessor
    protected String getNim(){
        return nim;
    }
    //method acessor
    protected String getMajor(){
        return Major;
    }
    //method acessor
    protected int getSemt(){
        return Semt;
    }
    //method acessor
    protected void belajar(){
        System.out.println(nama +" Sedang belajar");
    }
    //method acessor
    protected void ujian(){
        System.out.println(nama +" Sedang mengerjakan ujian");
    }
    //method acessor, override dari method acara di class CommunityMembers
    protected void acara(){
        System.out.println(nama + " Menghadiri acara komunitas");
    }
}
