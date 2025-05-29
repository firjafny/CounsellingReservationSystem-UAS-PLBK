package interfaces;

import models.Reservasi;

public interface IPayment {
    boolean prosessPembayaran(Reservasi reservasi, String metodePembayaran);
    void tampilkanBuktiPembayaran(Reservasi reservasi);
    String[] getMetodePembayaranTersedia();
}