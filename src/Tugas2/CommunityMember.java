package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class CommunityMember { //class Abstract
    protected int nik; //Encapsulation protected
    protected String email; //Encapsulation protected

    //Constructor CommunityMembers
    protected CommunityMember (int nik, String email) {
        this.nik = nik;
        this.email = email;
    }
    // method getNik (accessor)
    protected int getNik(){
        return nik;
    }
    // method getEmail (accessor)
    protected String getEmail(){
        return email;
    }
    // method acara (accessor)
    protected void acara(){
        System.out.println("Komunitas mengadakan sebuah acara");
    }
    // method liburan (accessor)
    protected void liburan(){
        System.out.println("Komunitas sedang melakukan liburan");
    }
}
