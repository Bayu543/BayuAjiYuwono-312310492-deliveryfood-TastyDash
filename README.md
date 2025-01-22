# Project UAS

## Profil
| Variable | Isi |
| -------- | --- |
| **Nama** |Bayu Aji Yuwono|
| **NIM** | 312310492 |
| **Kelas** | TI.23.A.5 |
| **Mata Kuliah** | Pemrograman mobile |
| **Dosen** | Donny Maulana, S.Kom., M.M.S.I. |


# Tasty Dash - Aplikasi Pemesanan Makanan

## Deskripsi
Tasty Dash adalah aplikasi mobile untuk memesan makanan secara online. Desain aplikasi ini dirancang untuk memberikan pengalaman pengguna yang sederhana, cepat, dan menarik. Pengguna dapat mencari, memilih, dan memesan makanan dari berbagai kategori serta melakukan pembayaran langsung melalui aplikasi.

---

## Struktur Antarmuka

### 1. **Tampilan Awal (Splash Screen)**
   - **Deskripsi**: Halaman pembuka aplikasi yang menampilkan logo dan nama aplikasi *Tasty Dash*.
   - **Fitur**:
     - Tombol *Get Started* untuk masuk ke halaman login atau daftar.

![Tampilan](https://github.com/user-attachments/assets/5d38eb86-d52a-4d59-9816-dc97dda50bfe)

---

### 2. **Halaman Login & Sign Up**
   - **Login**:
     - Formulir untuk memasukkan nama pengguna (email) dan kata sandi.
     - Tombol *Login* untuk masuk ke aplikasi.
   - **Sign Up**:
     - Formulir untuk membuat akun baru, termasuk nama, email, dan kata sandi.
     - Tombol *Sign Up* untuk mendaftarkan akun baru.

![Login signup](https://github.com/user-attachments/assets/4e64e11f-681a-4034-9871-ccc01440a102)

---

### 3. **Menu Utama**
   - **Deskripsi**: Halaman utama aplikasi yang menampilkan kategori makanan dan promosi.
   - **Fitur**:
     - **Pencarian**: Bar pencarian untuk mencari makanan atau minuman.
     - **Kategori**: Pilihan kategori seperti Makanan Sehat, Makanan Cepat Saji, dan Minuman.
     - **Promosi**: Banner promosi diskon atau penawaran khusus.
     - **Populer**: Daftar menu makanan/minuman yang populer.

![login](https://github.com/user-attachments/assets/335d078f-b4eb-4b1e-b8f8-6c6a3e804c5a)

---

### 4. **Halaman Kategori Makanan**
   - **Deskripsi**: Menampilkan daftar menu makanan berdasarkan kategori.
   - **Fitur**:
     - Informasi tentang nama makanan, harga, dan tombol tambah ke keranjang.

![signup](https://github.com/user-attachments/assets/583bdcf2-216b-4897-8fb2-52c65f2c4049)

---

### 5. **Detail Produk**
   - **Deskripsi**: Halaman detail untuk setiap makanan atau minuman.
   - **Fitur**:
     - Gambar produk.
     - Deskripsi makanan/minuman.
     - Harga.
     - Tombol untuk menambah ke keranjang.
     - Tombol untuk memesan langsung.

![Menu](https://github.com/user-attachments/assets/4495f2d7-2e97-4df3-9de9-2e411cd132e5)

---

### 6. **Keranjang Belanja**
   - **Deskripsi**: Menampilkan semua item yang telah ditambahkan ke keranjang.
   - **Fitur**:
     - Daftar item dengan jumlah, harga per item, dan total harga.
     - Tombol untuk melanjutkan pembayaran.

![Search](https://github.com/user-attachments/assets/149e6b9f-c0ce-4175-9024-671814ed2cca)

---

![Makanan_cepat_saji](https://github.com/user-attachments/assets/eceea979-d97f-4403-a1d0-755c6f57746e)

![Makanan_sehat](https://github.com/user-attachments/assets/343d2203-dc63-48da-85bf-7dfe8b7706e8)

![Minuman](https://github.com/user-attachments/assets/c1251cfe-e770-4b7d-9e87-0728cd627f61)

![Tampilan_Dalam_Menu_2](https://github.com/user-attachments/assets/69d03f66-31d2-4a71-9d7e-4b3778d77689)

---

### 7. **Halaman Pembayaran**
   - **Deskripsi**: Memungkinkan pengguna untuk melakukan pembayaran pesanan.
   - **Fitur**:
     - Informasi ringkasan pesanan.
     - Pilihan metode pembayaran (misalnya: Kartu Kredit, Debit).
     - Tombol *Pay Now* untuk menyelesaikan pembayaran.

![Paymen 2](https://github.com/user-attachments/assets/1277236c-ee1c-4894-a6b7-69a7682451cc)

---

### 8. **Pop-Up Konfirmasi**
   - **Deskripsi**: Menampilkan pop-up sukses setelah pembayaran selesai.
   - **Fitur**:
     - Notifikasi visual dengan ikon centang dan teks "Success".

![Popup_messege](https://github.com/user-attachments/assets/86e43fa9-6220-4ed1-bc97-20a52766acd0)

---

### 9. **Profil Pengguna**
   - **Deskripsi**: Halaman profil pengguna yang menampilkan informasi akun.
   - **Fitur**:
     - Foto profil.
     - Detail akun seperti nama dan email.
     - Tombol untuk keluar (*Logout*).

![Profile](https://github.com/user-attachments/assets/7684bd76-50d9-4841-b1c2-65012ae8292c)

---

## Teknologi yang Disarankan
- **Bahasa Pemrograman**: Kotlin atau Java (untuk Android).
- **Desain**: XML untuk layout UI.
- **Animasi**:
  - Transisi antar halaman menggunakan `ObjectAnimator` atau animasi bawaan Android (`res/anim`).
  - Efek pop-up dengan `DialogFragment`.

---

## Fitur Tambahan yang Direkomendasikan
1. **Notifikasi**:
   - Menggunakan *Push Notification* untuk promosi dan pembaruan pesanan.
2. **Simpan Favorit**:
   - Tambahkan opsi untuk menyimpan makanan/minuman favorit.
3. **Filter dan Sortir**:
   - Filter berdasarkan harga, kategori, atau ulasan.
4. **Ulasan Pengguna**:
   - Tambahkan fitur untuk memberikan ulasan dan rating pada menu.

---

## Catatan
Gambar desain ini mencakup perjalanan lengkap pengguna dari pendaftaran hingga pembayaran. Setiap elemen dirancang untuk memberikan pengalaman pengguna yang mulus dan intuitif.
