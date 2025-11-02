package com.siakmini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/** US-001: Dosen menambahkan Mahasiswa bimbingan */
public class Dosen {
    private final String nama;
    private final List<Mahasiswa> mahasiswaBimbingan = new ArrayList<>();

    public Dosen(String nama) {
        if (nama == null || nama.isBlank()) throw new IllegalArgumentException("Nama dosen tidak boleh kosong");
        this.nama = nama;
    }

    public String getNama() { return nama; }

    public void tambahMahasiswaBimbingan(Mahasiswa m) {
        if (m == null) throw new IllegalArgumentException("Mahasiswa tidak boleh null");
        if (!mahasiswaBimbingan.contains(m)) mahasiswaBimbingan.add(m);
    }

    public List<Mahasiswa> getMahasiswaBimbingan() { return Collections.unmodifiableList(mahasiswaBimbingan); }

    public void tampilkanMahasiswa() {
        System.out.println("Daftar mahasiswa bimbingan " + nama + ":");
        if (mahasiswaBimbingan.isEmpty()) System.out.println("- (kosong)");
        else for (Mahasiswa m : mahasiswaBimbingan) System.out.println("- " + m.getNama());
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dosen)) return false;
        Dosen d = (Dosen) o;
        return nama.equalsIgnoreCase(d.nama);
    }
    @Override public int hashCode() { return Objects.hash(nama.toLowerCase()); }
}
