package models;

public class Reservasi {
    private Client client;
    private Psikolog psikolog;
    private String jam;
    private boolean selesai;
    private boolean sudahBayar;
    private String metodePembayaran;

    public Reservasi(Client client, Psikolog psikolog, String jam) {
        this.client = client;
        this.psikolog = psikolog;
        this.jam = jam;
        this.selesai = false;
        this.sudahBayar = false;
        this.metodePembayaran = "Belum dipilih";
    }

    public Client getClient() {
        return client;
    }

    public Psikolog getPsikolog() {
        return psikolog;
    }

    public String getJam() {
        return jam;
    }

    public boolean isSelesai() {
        return selesai;
    }

    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
    }

    public boolean isSudahBayar() {
        return sudahBayar;
    }

    public void setSudahBayar(boolean sudahBayar) {
        this.sudahBayar = sudahBayar;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    @Override
    public String toString() {
        return "\n-----------------------" +
                "\nNama: " + client.getNama() +
               "\nUsia: " + client.getUsia() +
               "\nSpesialisasi: " + client.getSpesialisasi() +
               "\nPsikolog: " + psikolog.getNama() +
               "\nJam: " + jam +
               "\nStatus: " + (selesai ? "Selesai" : "Belum Selesai") +
               "\nPembayaran: " + (sudahBayar ? "Lunas (" + metodePembayaran + ")" : "Belum Bayar") +
               "\n-----------------------";
    }
}
