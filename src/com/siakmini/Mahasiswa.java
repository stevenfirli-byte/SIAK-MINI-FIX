package com.siakmini;

/** US-002: Mahasiswa melihat Dosen pembimbingnya */
public class Mahasiswa {
    private final String nama;
    private Dosen dosenPembimbing;

    public Mahasiswa(String nama) {
        if (nama == null || nama.isBlank()) throw new IllegalArgumentException("Nama mahasiswa tidak boleh kosong");
        this.nama = nama;
    }

    public String getNama() { return nama; }

    public void setDosenPembimbing(Dosen d) { this.dosenPembimbing = d; }

    public String lihatDosenPembimbing() {
        return (dosenPembimbing == null)
            ? "Mahasiswa " + nama + " belum memiliki dosen pembimbing."
            : "Dosen pembimbing " + nama + ": " + dosenPembimbing.getNama();
    }
}
