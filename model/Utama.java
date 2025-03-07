package model;

public class Utama {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Nusantara Abadi");
        Karyawan karyawan1 = new Karyawan("Budi Santoso", 5000000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Dewi Anggraini", 5500000, perusahaan);
        Karyawan karyawan3 = new Karyawan("Ahmad Fauzi", 4800000, perusahaan);
            
        karyawan1.info();
        karyawan2.info();
        karyawan3.info();
    }
}
