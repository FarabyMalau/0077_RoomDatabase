# Pertemuan9 - Aplikasi Data Siswa

Aplikasi Android sederhana untuk mengelola data siswa (CRUD) menggunakan **Jetpack Compose**, **Room Database**, dan arsitektur **MVVM**. Data disimpan secara lokal di perangkat sehingga tetap ada saat aplikasi ditutup.

## ✨ Fitur Aplikasi

* Halaman Beranda
* Tambah Data
* Detail Data
* Edit Data
* Konfirmasi Hapus

## 🖼️ Tangkapan Layar (Screenshots)

### 1. Beranda Kosong & Form Tambah Data

| Beranda Kosong | Form Tambah Data |
|:---:|:---:|
| ![Beranda Kosong](<img width="397" height="827" alt="image" src="https://github.com/user-attachments/assets/040a6ef0-7a83-4824-8a96-70eb87a807c1" />
) | ![Form Tambah Data](<img width="392" height="820" alt="image" src="https://github.com/user-attachments/assets/4d15b6d8-9e77-4a11-af13-49aefa242127" />
) |

### 2. Detail, Edit, & Hapus Data

| Detail Data | Edit Data | Konfirmasi Hapus |
|:---:|:---:|:---:|
| ![Detail Data](<img width="395" height="823" alt="image" src="https://github.com/user-attachments/assets/2646ab61-3d85-4eab-aed1-5ae1fc03873f" />) (<img width="380" height="822" alt="image" src="https://github.com/user-attachments/assets/8e755973-4835-4203-b52b-c180b159ae1d" />)
| ![Edit Data](<img width="390" height="820" alt="image" src="https://github.com/user-attachments/assets/846284aa-141e-4b6b-994d-129df5406764" />) (<img width="392" height="822" alt="image" src="https://github.com/user-attachments/assets/7fd9b7fc-1554-43da-baed-613e63d4771b" />)
 | ![Konfirmasi Hapus](<img width="391" height="821" alt="image" src="https://github.com/user-attachments/assets/504dd1ea-347a-4cff-b2c7-8176ca3ac5d8" />
) (<img width="388" height="820" alt="image" src="https://github.com/user-attachments/assets/4b176bdd-a787-40b6-a911-06119ad2ba7c" />)
 |

## 🛠️ Teknologi yang Digunakan

* **Kotlin**
* **Jetpack Compose** + **Material 3** untuk tampilan
* **Room Database** (dengan KSP) untuk penyimpanan lokal
* **Navigation Compose** untuk perpindahan antar halaman
* **ViewModel**, **StateFlow**, dan **Coroutines** untuk pengelolaan state
* Pola arsitektur **MVVM** dengan Repository

## 📁 Struktur Proyek

```
com.example.pertemuan9
├── AplikasiSiswa.kt          # Application class (menyimpan container)
├── MainActivity.kt
├── repositori/               # RepositoriSiswa, ContainerApp
├── room/                     # Siswa (Entity), SiswaDao, DatabaseSiswa
├── uicontroller/             # PetaNavigasi, AppBar, HalamanDetailSiswa, HalamanEdit
│   └── route/                # DestinasiDetailSiswa, DestinasiEditSiswa
├── view/                     # HalamanHome, HalamanEntry
└── viewmodel/
    ├── PenyediaViewModel.kt
    └── provider/             # Home, Entry, Detail, EditViewModel
```

## 🚀 Cara Menjalankan

1. Clone repository ini:
   ```bash
   git clone <url-repository-anda>
   ```
2. Buka proyek dengan **Android Studio**.
3. Tunggu proses **Gradle Sync** selesai.
4. Pilih emulator atau perangkat Android, lalu klik **Run** (`Shift + F10`).

## 📝 Alur Penggunaan

1. **Beranda**: menampilkan daftar siswa. Jika belum ada data, muncul pesan "Tidak ada data siswa".
2. **Tambah Data**: tekan tombol **+**, isi nama, alamat, dan telepon, lalu tekan **Simpan**.
3. **Detail Data**: ketuk salah satu siswa pada daftar untuk melihat informasi lengkapnya.
4. **Edit Data**: pada halaman detail, tekan tombol edit, ubah data, lalu simpan.
5. **Hapus Data**: pada halaman detail, tekan **Hapus**, lalu konfirmasi pada dialog yang muncul.
