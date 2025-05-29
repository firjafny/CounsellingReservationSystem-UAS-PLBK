# Counselling Reservation System

Sistem Reservasi Konseling Psikologi berbasis Java yang memungkinkan klien untuk memesan sesi konseling dengan psikolog dan psikolog untuk mengelola jadwal mereka.

## 📋 Deskripsi

Counselling Reservation System adalah aplikasi console yang dirancang untuk memfasilitasi proses reservasi konseling psikologi. Sistem ini memiliki dua jenis pengguna utama: **Client** (pasien) dan **Psikolog** (konselor), dengan sistem pembayaran terintegrasi.

## 🏗️ Arsitektur Sistem

Sistem ini dibangun menggunakan **Component-Based Architecture** dengan tiga interface utama:

- **IClientMgt** - Mengelola operasi klien
- **IPsikologMgt** - Mengelola operasi psikolog  
- **IPayment** - Mengelola sistem pembayaran

## 🚀 Fitur Utama

### Untuk Client:
- ✅ Melihat daftar psikolog tersedia
- ✅ Membuat reservasi berdasarkan spesialisasi
- ✅ Memilih jadwal yang tersedia
- ✅ Sistem pembayaran terintegrasi
- ✅ Melihat riwayat reservasi
- ✅ Membatalkan reservasi

### Untuk Psikolog:
- ✅ Melihat reservasi aktif
- ✅ Menandai sesi sebagai selesai
- ✅ Melihat riwayat pasien
- ✅ Mengelola jadwal ketersediaan

### Sistem Pembayaran:
- ✅ Multiple metode pembayaran (Transfer Bank, E-Wallet, Kartu Kredit)
- ✅ Simulasi proses pembayaran
- ✅ Bukti pembayaran otomatis
- ✅ Biaya konsultasi: Rp 150.000

## 🔧 Struktur Project

```
src/
├── interfaces/
│   ├── IClientMgt.java
│   ├── IPsikologMgt.java
│   └── IPayment.java
├── models/
│   ├── Client.java
│   ├── Psikolog.java
│   └── Reservasi.java
├── services/
│   ├── ClientService.java
│   ├── PsikologService.java
│   └── PaymentService.java
└── CounsellingReservationSystem.java
```

## 🎯 Spesialisasi Psikolog

Sistem mendukung tiga kategori spesialisasi:

| Spesialisasi | Psikolog Tersedia |
|--------------|-------------------|
| **Keluarga** | Dr. Andini, Dr. Caleb |
| **Remaja**   | Dr. Xavier, Dr. Rafi |
| **Anak**     | Dr. Sinta, Dr. Zayne |

## ⏰ Jadwal Tersedia

Setiap psikolog memiliki jadwal default:
- 09:00
- 11:00  
- 13:00
- 15:00

*Jadwal akan terhapus otomatis setelah direservasi*

## 💻 Cara Menjalankan

### Prerequisites
- Java Development Kit (JDK) 8 atau lebih tinggi
- IDE Java (IntelliJ IDEA, Eclipse, VS Code, dll.) atau Command Line

### Langkah Instalasi

1. **Clone atau download project ini**
   ```bash
   git clone <repository-url>
   cd counselling-reservation-system
   ```

2. **Compile semua file Java**
   ```bash
   javac -d out src/**/*.java src/*.java
   ```

3. **Jalankan aplikasi**
   ```bash
   java -cp out CounsellingReservationSystem
   ```

### Menggunakan IDE

1. Import project ke IDE favorit Anda
2. Pastikan semua file berada dalam package yang benar
3. Run `CounsellingReservationSystem.java` sebagai main class

## 🎮 Cara Penggunaan

### Menu Utama
```
=== Counselling Reservation System ===
1. Masuk sebagai Client
2. Masuk sebagai Psikolog
0. Keluar
```

### Sebagai Client
1. Pilih "Masuk sebagai Client"
2. Gunakan menu yang tersedia:
   - Lihat daftar psikolog
   - Buat reservasi (isi data diri → pilih spesialisasi → pilih psikolog → pilih jadwal → bayar)
   - Lihat riwayat reservasi
   - Batalkan reservasi

### Sebagai Psikolog
1. Pilih "Masuk sebagai Psikolog"
2. Pilih nama psikolog dari daftar
3. Gunakan menu psikolog:
   - Lihat reservasi aktif
   - Tandai sesi selesai
   - Lihat riwayat pasien

## 🤝 Anggota

Jika Anda ingin berkontribusi pada project ini:

1. 2208107010059 - Firjatullah Afny Abus
2. 2208107010069 - Azimah Al-Huda

---

> *"Kesehatan mental adalah prioritas, teknologi adalah jembatannya."*