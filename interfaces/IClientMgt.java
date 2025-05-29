package interfaces;

import models.Psikolog;
import java.util.List;

public interface IClientMgt {
    void menu();
    void lihatPsikolog();
    void buatReservasi();
    void lihatRiwayat();
    void batalkanReservasi();
    List<Psikolog> getDaftarPsikolog();
}