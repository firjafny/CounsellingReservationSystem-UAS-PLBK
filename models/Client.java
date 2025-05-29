package models;

public class Client {
    private String nama;
    private int usia;
    private String gender;
    private String spesialisasi;

    public Client(String nama, int usia, String gender, String spesialisasi) {
        this.nama = nama;
        this.usia = usia;
        this.gender = gender;
        this.spesialisasi = spesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getJenisKelamin() {
        return gender;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    @Override
    public String toString() {
        return nama + " (" + usia + ", " + gender + ") - Spesialis: " + spesialisasi;
    }
}
