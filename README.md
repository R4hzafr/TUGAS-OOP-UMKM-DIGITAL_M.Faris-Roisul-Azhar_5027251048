# TUGAS-OOP-UMKM-DIGITAL_M.Faris-Roisul-Azhar_5027251048
## Deskripsi kasus
UMKM merupakan jantung perekonomian bagi Indonesia.UMKM juga menjadi roda penggerak ekonomi masyarakat Indoensia.Tidak terkecuali di daerah tempat tinggal saya yaitu di Kediri.di mana,UMKM di Kediri masih menggunakan cara manual dalam pengelolaan atau manajemen dari data pembelian mereka(UMKM).Disini program UMKM digital berbasis OOP hadir untuk membantu permasalahan tersebut program ini membantu dalam otomatisasi manajememn serta efisiensi dalam pengelolaan data.
## Class Diagram

<img width="836" height="634" alt="Screenshot 2026-04-05 at 23 37 59" src="https://github.com/user-attachments/assets/92cab9a1-44cd-43f9-93aa-a525c0130dcd" />

## code 

<img width="342" height="458" alt="Screenshot 2026-04-05 at 23 39 43" src="https://github.com/user-attachments/assets/ebebec11-2422-44fc-ba24-e892b6488d16" />

## Screenshot Output

<img width="310" height="84" alt="Screenshot 2026-04-05 at 23 44 14" src="https://github.com/user-attachments/assets/16a21b24-15e7-4467-b136-92f31e1225f6" />

## Prinsip OOP yang digunakan
Program ini sudah menerapkan beberapa prinsip utama dalam Object-Oriented Programming (OOP). Pertama, prinsip inheritance (pewarisan) terlihat pada class PecelKediri yang merupakan turunan dari MenuPecel, sehingga dapat mewarisi atribut seperti jenisPecel dan hargaPecelOri. Kedua, prinsip abstraction (abstraksi) diterapkan melalui penggunaan abstract class MenuPecel, yang hanya mendefinisikan metode hitungBill() tanpa implementasi, sehingga detail perhitungannya diserahkan kepada subclass. Ketiga, prinsip polymorphism (polimorfisme) tampak pada method prosesOrder(MenuPecel orderan) di class Kasir, di mana method tersebut dapat menerima berbagai jenis objek turunan dari MenuPecel dan tetap bekerja dengan cara yang sesuai. Terakhir, prinsip encapsulation (enkapsulasi) digunakan pada atribut saldoKasir yang dibuat private dan hanya dapat diakses melalui method getSaldoKasir(), sehingga data lebih aman dan terkontrol.

## Keunikan Program
Program ini tentunya membantu UMKM dalam manajemen penjualan produk dan otomatisasi serta efisiensi pada data penjualanya dengan menggunakan prinsip OOP 

