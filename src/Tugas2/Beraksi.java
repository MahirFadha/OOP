package Tugas3;
/*
author M. Sulthan Mahir Fadha (09020623035)
 */
public class Beraksi {
    public static void main(String[] args) {
        System.out.println("=====Community Member=====");
        CommunityMember Dzaky = new CommunityMember(123451, "dzakybudiman@gmail.com");
        System.out.println(Dzaky.getNik());
        System.out.println(Dzaky.getEmail());
        Dzaky.acara();

        System.out.println("\n=====Alumnus=====");
        Alumnus Bambang = new Alumnus(123452, "bambang123@gmail.com", "Bambang Edi", "Ilmu Fiqih", 1111, 3.56);
        System.out.println(Bambang.getNik());
        System.out.println(Bambang.getIpk());
        Bambang.acara();

        System.out.println("\n=====Student=====");
        Student Mahir = new Student(123453, "mahirfadha@gmail.com", "Mahir Fadha", "09020623035", "Sistem Informasi", 3);
        System.out.println(Mahir.getNim());
        System.out.println(Mahir.getEmail());
        Mahir.acara();

        System.out.println("\n=====Employee=====");
        Employee Najib = new Employee(123454,"najib2005@gmail.com",111,"Surabaya","085330032387");
        System.out.println(Najib.getIdNum());
        System.out.println(Najib.getNik());
        Najib.rapat();

        System.out.println("\n=====Staff=====");
        Staff Justin = new Staff(123455,"justinhubner@gmail.com",112,"Sidoarjo","08508080808","Justin Hubner","Malam",3200000);
        System.out.println(Justin.getShiftKerja());
        System.out.println(Justin.getGaji());
        Justin.gajian();

        System.out.println("\n=====Faculty=====");
        Faculty Saintek = new Faculty(123456,"saintekuinsa@gmail.com",113,"Surabaya","081212344321",0001,"Manajemen");
        System.out.println(Saintek.getAlamat());
        System.out.println(Saintek.getNomorHp());
        Saintek.tes();

        System.out.println("\n=====Tecaher=====");
        Teacher Munip = new Teacher(123457,"munipabsullah@gmail.com",114,"Lamongan","098765432121",002,"Politik","Munip Abdullah","Politik Dasar",2);
        System.out.println(Munip.getSks());
        System.out.println(Munip.getMatkul());
        Munip.tes();

        System.out.println("\n=====Administrator=====");
        Administrator Hadi = new Administrator(123458,"hadimul24@gmail.com",115,"Gresik","088877773333",0005,"Ekonomi","Hadi Mulyadi","Tata Usaha");
        System.out.println(Hadi.getBagian());
        System.out.println(Hadi.getNik());
        Hadi.arsip();
    }
}
