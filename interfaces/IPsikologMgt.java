package interfaces;

import models.Psikolog;

public interface IPsikologMgt {
    void menu(Psikolog psikolog);
    void lihatReservasiAktif(Psikolog psikolog);
    void tandaiSelesai(Psikolog psikolog);
    void lihatRiwayat(Psikolog psikolog);
}