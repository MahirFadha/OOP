package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Teacher extends Faculty{
    //konkret class, inheritence dari class Faculty
    private String nama; //encapsulasi private
    private String Matkul; //encapsulasi private
    int sks; //encapsulasi private

    protected Teacher(int nik,String email,int idEmp, String alamat, String nomorHp,int nip,String bidangKeahlian,String nama,String Matkul,int sks){
        //konstrktor Teacher yang menuruni nilai nik,email,idNum,alamat,nomorHp,nip dan bidang keahlian dari class Faculty
        super(nik, email, idEmp, alamat, nomorHp, nip, bidangKeahlian);
        this.nama = nama;
        this.Matkul = Matkul;
        this.sks = sks;
    }
    //method acessor
    protected String getNama() {
        return nama;
    }
    //method acessor
    protected String getMatkul(){
        return Matkul;
    }
    //method acessor
    protected int getSks(){
        return sks;
    }
    //method acessor
    protected void mengajar(){
        System.out.println("Dosen sedang mengajar mata kuliah " + Matkul);
    }
    //method acessor
    protected void berangkat(){
        System.out.println("Bapak/Ibu " + nama + " Sedang dalam perjalanan");
    }
    //method acessor, override dari method tes
    protected void tes(){
        System.out.println(nama + " mengikuti tes fakultas");
    }
}

