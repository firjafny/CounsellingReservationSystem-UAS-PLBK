import models.Psikolog;
import models.Reservasi;
import services.ClientService;
import services.PsikologService;
import services.PaymentService;
import interfaces.IClientMgt;
import interfaces.IPsikologMgt;
import interfaces.IPayment;

import java.util.*;

public class CounsellingReservationSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Reservasi> semuaReservasi = new ArrayList<>();

            // Dependency Injection - membuat services sesuai interface
            IPayment paymentService = new PaymentService();
            IClientMgt clientService = new ClientService(semuaReservasi, paymentService);
            IPsikologMgt psikologService = new PsikologService(semuaReservasi);

            List<Psikolog> daftarPsikolog = clientService.getDaftarPsikolog();

            while (true) {
                System.out.println("\n=== Counselling Reservation System ===");
                System.out.println("1. Masuk sebagai Client");
                System.out.println("2. Masuk sebagai Psikolog");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                int pilih = scanner.nextInt();
                scanner.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("\nHai! Silahkan menggunakan fitur yang telah disediakan^^");
                        clientService.menu();
                        break;
                    case 2:
                        System.out.println("\n--- Login Psikolog ---");
                        for (int i = 0; i < daftarPsikolog.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarPsikolog.get(i).getNama());
                        }
                        System.out.print("Pilih psikolog: ");
                        int idx = scanner.nextInt();
                        scanner.nextLine();
                        if (idx < 1 || idx > daftarPsikolog.size()) {
                            System.out.println("Pilihan tidak valid :(");
                            break;
                        }
                        psikologService.menu(daftarPsikolog.get(idx - 1));
                        break;
                    case 0:
                        System.out.println("Terima kasih sudah menggunakan Counselling Reservation System! \nSemangat menjalani hari Anda!^-^");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid :(");
                        break;
                }
            }
        }
    }
}