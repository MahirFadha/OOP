package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Employee extends CommunityMember{
    //konkret class, inheritence dari class CommunityMember
    private int idEmp; //encapsulasi private
    private String alamat; //encapsulasi private
    private String nomorHp; //encapsulasi private

    //konstrktor Employee yang menuruni nilai nik dan email dari class CommunityMembers
    protected Employee(int nik,String email,int idEmp, String alamat, String nomorHp) {
        super(nik,email);
        this.idEmp = idEmp;
        this.alamat = alamat;
        this.nomorHp = nomorHp;
    }
    //method acessor
    protected int getIdNum() {
        return idEmp;
    }
    //method acessor
    protected String getAlamat() {
        return alamat;
    }
    //method acessor
    protected String getNomorHp(){
        return nomorHp;
    }
    //method acessor
    protected void bekerja(){
        System.out.println("Pegawai sedang bekerja");
    }
    //method acessor
    protected void libur(){
        System.out.println("Pegawai sedang libur");
    }
    protected void rapat(){
        System.out.println("Pegawai sedang rapat");
    }
}
