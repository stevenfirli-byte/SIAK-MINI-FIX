package com.siakmini;

public class Main {
    public static void main(String[] args) {
        // Sprint 1 demo: US-001 & US-002
        Dosen budi = new Dosen("Budi");
        Mahasiswa ali = new Mahasiswa("Ali");
        Mahasiswa dina = new Mahasiswa("Dina");

        ali.setDosenPembimbing(budi);
        dina.setDosenPembimbing(budi);

        budi.tambahMahasiswaBimbingan(ali);
        budi.tambahMahasiswaBimbingan(dina);

        budi.tampilkanMahasiswa();
        System.out.println(ali.lihatDosenPembimbing());
        System.out.println(dina.lihatDosenPembimbing());
    }
}
