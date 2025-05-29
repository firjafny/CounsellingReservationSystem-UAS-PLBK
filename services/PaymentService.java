package services;

import interfaces.IPayment;
import models.Reservasi;

public class PaymentService implements IPayment {
    private String[] metodePembayaranTersedia = {"Transfer Bank", "E-Wallet", "Kartu Kredit"};

    @Override
    public boolean prosessPembayaran(Reservasi reservasi, String metodePembayaran) {
        System.out.println("\n--- Memproses Pembayaran ---");
        System.out.println("Metode: " + metodePembayaran);
        System.out.println("Biaya konsultasi: Rp 150.000");
        
        try {
            // Simulasi proses pembayaran
            Thread.sleep(1000);
            System.out.println("Pembayaran berhasil!");
            
            reservasi.setMetodePembayaran(metodePembayaran);
            reservasi.setSudahBayar(true);
            return true;
        } catch (InterruptedException e) {
            System.out.println("Terjadi kesalahan dalam proses pembayaran.");
            return false;
        }
    }

    @Override
    public void tampilkanBuktiPembayaran(Reservasi reservasi) {
        System.out.println("\n=== BUKTI PEMBAYARAN ===");
        System.out.println("Nama: " + reservasi.getClient().getNama());
        System.out.println("Usia: " + reservasi.getClient().getUsia());
        System.out.println("Kelamin: " + reservasi.getClient().getJenisKelamin());
        System.out.println("Spesialisasi: " + reservasi.getClient().getSpesialisasi());
        System.out.println("Psikolog: " + reservasi.getPsikolog().getNama());
        System.out.println("Jam: " + reservasi.getJam());
        System.out.println("Metode Pembayaran: " + reservasi.getMetodePembayaran());
        System.out.println("Status: Lunas");
        System.out.println("Biaya: Rp 150.000");
        System.out.println("========================");
    }

    @Override
    public String[] getMetodePembayaranTersedia() {
        return metodePembayaranTersedia;
    }
}