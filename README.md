# 📝 Weighted Graph Java
Implementasi Graf Berbobot dengan Matriks Adjacensi di Java

Proyek Java yang menunjukkan struktur data graf berbobot menggunakan matriks adjacensi untuk representasi hubungan antar vertex.

## 📖 Deskripsi Proyek
**Weighted_Graph_Java** adalah proyek Java yang mengimplementasikan graf berbobot dengan matriks adjacensi. Proyek ini berfokus pada:
- **📊 Vertex.java**: Kelas dasar untuk vertex dengan label karakter.
- **🔍 Graph.java**: Kelas utama untuk mengelola graf dengan metode `addVertex` untuk menambahkan vertex, `addEdge` untuk menghubungkan vertex dengan bobot, dan `print` untuk menampilkan matriks adjacensi.
- **🛠️ GraphMain.java**: Kelas utama untuk menguji graf dengan menambahkan vertex (A, H, W, C, D) dan edge berbobot (100, 800, 750, 400, 370).

Proyek ini terdiri dari tiga file Java (`GraphMain.java`, `Graph.java`, `Vertex.java`) dalam paket `PERTEMUAN8`. Cocok untuk pemula yang ingin mempelajari struktur data graf. 🟢

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Weighted_Graph_Java/
├── src/PERTEMUAN8/
├── GraphMain.java           # 🛠️ Kelas utama untuk pengujian
├── Graph.java               # 🔍 Kelas untuk graf berbobot
├── Vertex.java              # 📊 Kelas vertex
```

## 🟢 Catatan:
- Graf diinisialisasi dengan maksimum 10 vertex dan matriks adjacensi diisi `-1` untuk edge yang tidak ada.
- Edge ditambahkan secara simetris (undirected graph) dengan bobot positif.

## 📈 Contoh Output
```
Graph:
        A       H       W       C       D
A       0       100     800     -1      -1
H       100     0       750     -1      -1
W       800     750     0       400     -1
C       -1      -1      400     0       370
D       -1      -1      -1      370     0
```

## 👨‍💻 Pengembang
**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)
