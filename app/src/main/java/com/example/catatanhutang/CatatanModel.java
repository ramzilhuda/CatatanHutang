package com.example.catatanhutang;

public class CatatanModel {

    //1. tambahkan String id, judul, jumlahhutang, tanggal;
    //2. Klik kanan pilih generete > Getter and Setter
    //3. kembali ke MainAcitivity
    private String id;
    private String judul;
    private String jumlahhutang;
    private String tanggal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJumlahhutang() {
        return jumlahhutang;
    }

    public void setJumlahhutang(String jumlahhutang) {
        this.jumlahhutang = jumlahhutang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
