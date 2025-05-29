package models;

import java.util.ArrayList;
import java.util.List;

public class Psikolog {
    private String nama;
    private String spesialisasi;
    private List<String> jadwalAvailable;

    public Psikolog(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.jadwalAvailable = new ArrayList<>();
        jadwalAvailable.add("09:00");
        jadwalAvailable.add("11:00");
        jadwalAvailable.add("13:00");
        jadwalAvailable.add("15:00");
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public List<String> getJadwalAvailable() {
        return jadwalAvailable;
    }

    public void hapusJadwal(String jam) {
        jadwalAvailable.remove(jam);
    }

    @Override
    public String toString() {
        return nama + " (Spesialisasi: " + spesialisasi + ")";
    }
}