# P02_01. Sistem Manajemen Tugas 

Studi Kasus: Sistem Manajemen Tugas untuk Mata Kuliah Pemrograman

Setelah sukses dengan Sistem Manajemen Tugas (SMT), Poppy dan Mabel memutuskan untuk menambahkan fitur rekomendasi. Mereka ingin mahasiswa tidak hanya tahu prioritas tugas berdasarkan deadline dan tingkat kesulitan, tetapi juga mendapatkan saran aksi berdasarkan prioritas tersebut.

Deskripsi Tambahan:

*9. Rekomendasi Tugas*

Berdasarkan prioritas, sistem akan memberikan rekomendasi tindakan kepada mahasiswa.

Jika prioritas di atas 3: "Penting! Anda harus mengerjakan tugas ini segera."
Jika prioritas di antara 1.5 hingga 3: "Tugas ini memiliki prioritas menengah."
Jika prioritas di bawah 1.5: "Tugas ini relatif ringan, namun jangan tunda terlalu lama."

cara menghitung prioritas:
prioritas =TingkatKesulitan * (1.0 / hariHinggaDeadline)

Fitur Tambahan:
Memberikan rekomendasi tindakan berdasarkan prioritas tugas.
Mengurutkan tugas berdasarkan prioritasnya dan menampilkan rekomendasi.

## Input - Output Simulation
Dalam simulasi ini, pengguna akan memasukkan semua informasi yang dibutuhkan tentang tugas, termasuk tingkat kesulitan dan hari hingga deadline. Setelah itu, sistem akan menampilkan informasi tugas beserta prioritas dan rekomendasi tindakannya.

### Example 1
**Input**:
```bash
Buat program untuk simulasi ATM sederhana.
12S1103
Pemrograman Lanjutan
Dr. Emily Watson
5 Oktober 2023, pukul 15.00 WIB
12S22005_PoppySibuea_PemrogramanLanjutan
5    # Tingkat Kesulitan (1-5)
3    # Hari hingga deadline
Belum Selesai  # Status (Belum Selesai/Sudah Selesai)

```


**Output**:
```bash
Prioritas: 1.67
Buat program untuk simulasi ATM sederhana.|12S1103|Pemrograman Lanjutan|Dr. Emily Watson|5 Oktober 2023, pukul 15.00 WIB|12S22005_PoppySibuea_PemrogramanLanjutan|Belum Selesai|Tugas ini memiliki prioritas menengah.

```

### Example 2
**Input**:
```bash
Buat program untuk simulasi ATM sederhana.
12S1103
Pemrograman Lanjutan
Dr. Emily Watson
5 Oktober 2023, pukul 15.00 WIB
12S23046_Anastasya_PemrogramanLanjutan
5    # Tingkat Kesulitan (1-5)
1    # Hari hingga deadline
Belum Selesai  # Status (Belum Selesai/Sudah Selesai)

```

**Output**:
```bash
Prioritas: 5.00
Buat program untuk simulasi ATM sederhana.|12S1103|Pemrograman Lanjutan|Dr. Emily Watson|5 Oktober 2023, pukul 15.00 WIB|12S23046_Anastasya_PemrogramanLanjutan|Belum Selesai|Penting! Anda harus mengerjakan tugas ini segera.

```











# P02_02. Pengelolaan Gudang Buku 

Dalam kota Balige, Seprian dan Anastasya adalah dua sahabat yang memiliki kecintaan pada buku. Mereka memutuskan untuk menggabungkan gairah mereka dengan membuka toko buku. Bisnis mereka tumbuh dengan cepat, dan mereka membutuhkan sebuah gudang untuk menyimpan koleksi buku yang terus bertambah. Untuk mengelola gudang buku ini, mereka memerlukan sebuah sistem.

Fitur Gudang:

1. Nama Gudang: Sebuah identifikasi unik untuk setiap gudang.
2. Kapasitas Gudang: Menunjukkan berapa banyak buku yang dapat disimpan.
3. Jumlah Buku Saat Ini: Menghitung buku yang saat ini ada di gudang.
4. AC: Menentukan apakah gudang dilengkapi dengan AC untuk menjaga kondisi buku.
5. Lantai: Material lantai yang digunakan, yang bisa mempengaruhi kondisi penyimpanan.
6. Ketersediaan Teknologi: Teknologi yang digunakan dalam gudang untuk mempermudah pengelolaan, seperti sistem pelacakan atau pencahayaan.
   

Namun, hanya memiliki informasi tentang gudang tidaklah cukup. Seprian dan Anastasya ingin mengetahui kualitas pengelolaan gudang mereka. Maka dari itu, mereka memutuskan untuk membuat sistem penilaian.

Cara Mendapatkan Poin:

Poin diberikan berdasarkan persentase kapasitas gudang yang terpakai.
Misalkan jika 20% kapasitas terpakai, gudang mendapat poin 20. Demikian seterusnya.

Dengan sistem penilaian ini, gudang dapat diberi status berdasarkan skor total yang diperoleh:

-  Skor >= 40: Gudang Elite
-  Skor >= 25: Gudang Standar
-  Skor < 25: Gudang Perlu Peningkatan

Seprian dan Anastasya berharap dengan sistem ini, mereka dapat meningkatkan kualitas pengelolaan gudang buku mereka, sehingga memastikan bahwa setiap buku yang dijual berada dalam kondisi terbaik.

## Example 1
**Input**:
```bash
Nama Gudang: Gudang Haloha
Kapasitas Gudang: 5000
Jumlah Buku Saat Ini: 1000
AC: no
Lantai: kayu
Ketersediaan Teknologi: sistem pelacakan stok otomatis, sistem pencahayaan


```

## Output

**Output**:
```bash
Informasi Gudang:
Gudang Haloha|5000|1000|no|kayu|sistem pelacakan stok otomatis, sistem pencahayaan|20|Gudang Perlu Peningkatan

```

Penjelasan:
Penggunaan kapasitas gudang = (1000/5000) x 100% = 20%
Dengan demikian, Skor Gudang = 20.


## Example 2
**Input**:
```bash
Gudang Samping
3500
1400
no
kayu
sistem pencahayaan, peralatan material handling

```

## Output

**Output**:
```bash
Informasi Gudang:
Gudang Samping|3500|1400|no|kayu|sistem pencahayaan, peralatan material handling|40|Gudang Elite

```

Penjelasan:
Penggunaan kapasitas gudang = (1400/3500) x 100% = 40%
Dengan demikian, Skor Gudang = 40.








