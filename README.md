# TUGAS-OOP-UMKM-DIGITAL_M.Faris-Roisul-Azhar_5027251048
## Deskripsi kasus
UMKM merupakan jantung perekonomian bagi Indonesia.UMKM juga menjadi roda penggerak ekonomi masyarakat Indoensia.Tidak terkecuali di daerah tempat tinggal saya yaitu di Kediri.di mana,UMKM di Kediri masih menggunakan cara manual dalam pengelolaan atau manajemen dari data pembelian mereka(UMKM).Disini program UMKM digital berbasis OOP hadir untuk membantu permasalahan tersebut program ini membantu dalam otomatisasi manajememn serta efisiensi dalam pengelolaan data.
## Class Diagram

<img width="855" height="635" alt="Screenshot 2026-04-06 at 07 26 47" src="https://github.com/user-attachments/assets/afd6519c-a1fe-41b1-9867-2a1da9825a2a" />


## code 
pada mermaid AI

<img width="450" height="697" alt="Screenshot 2026-04-06 at 07 27 20" src="https://github.com/user-attachments/assets/80749120-37e7-46e0-9290-a8f497668d7d" />

pada vs code:

MainMenuPecel.java

<img width="636" height="297" alt="Screenshot 2026-04-06 at 07 29 53" src="https://github.com/user-attachments/assets/a619eedb-5b1b-4caa-b392-0f5a69137844" />

MenuPecel.java


<img width="552" height="224" alt="Screenshot 2026-04-06 at 07 29 06" src="https://github.com/user-attachments/assets/e8d2245f-ac5d-4f21-9812-d3a9de15c543" />

PecelKediri.java

<img width="658" height="308" alt="Screenshot 2026-04-06 at 07 30 11" src="https://github.com/user-attachments/assets/0bc429e8-637d-4278-925f-00ae02d7ac7f" />

Kasir.java

<img width="752" height="287" alt="Screenshot 2026-04-06 at 07 30 21" src="https://github.com/user-attachments/assets/3d59816c-4e3e-40b8-a6b4-7f0c7a3404a2" />




## Screenshot Output

<img width="310" height="84" alt="Screenshot 2026-04-05 at 23 44 14" src="https://github.com/user-attachments/assets/16a21b24-15e7-4467-b136-92f31e1225f6" />

## Prinsip OOP yang digunakan
Program ini sudah menerapkan beberapa prinsip utama dalam Object-Oriented Programming (OOP). Pertama, prinsip inheritance (pewarisan) terlihat pada class PecelKediri yang merupakan turunan dari MenuPecel, sehingga dapat mewarisi atribut seperti jenisPecel dan hargaPecelOri. Kedua, prinsip abstraction (abstraksi) diterapkan melalui penggunaan abstract class MenuPecel, yang hanya mendefinisikan metode hitungBill() tanpa implementasi, sehingga detail perhitungannya diserahkan kepada subclass. Ketiga, prinsip polymorphism (polimorfisme) tampak pada method prosesOrder(MenuPecel orderan) di class Kasir, di mana method tersebut dapat menerima berbagai jenis objek turunan dari MenuPecel dan tetap bekerja dengan cara yang sesuai. Terakhir, prinsip encapsulation (enkapsulasi) digunakan pada atribut saldoKasir yang dibuat private dan hanya dapat diakses melalui method getSaldoKasir(), sehingga data lebih aman dan terkontrol.

## Keunikan Program
Program ini tentunya membantu UMKM dalam manajemen penjualan produk dan otomatisasi serta efisiensi pada data penjualanya dengan menggunakan prinsip OOP 

