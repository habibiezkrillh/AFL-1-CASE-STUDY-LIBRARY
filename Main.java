import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat objek pengarang
        Pengarang pengarang = new Pengarang(1, "Ahmad", "Jl. Mawar No. 10", "081234567890", "ahmad@example.com");

        // Membuat objek penerbit
        Penerbit penerbit = new Penerbit(1, "Gramedia", "Jl. Melati No. 20", "081234567891", "info@gramedia.com");

        // Membuat objek kategori
        Kategori kategori = new Kategori(1, "Fiksi", "Kategori untuk buku fiksi");

        // Membuat objek buku majalah
        BukuMajalah bukuMajalah = new BukuMajalah(
            1,
            penerbit.getIdPenerbit(),
            pengarang.getIdPengarang(),
            kategori.getIdKategori(),
            "Softcover",
            "Pertama",
            "Harry Potter",
            "Fiksi Fantasi",
            2000,
            1,
            2,
            3,
            6,
            1234567890123L
        );

        // Membuat objek CD
        CD cd = new CD(
            1,
            "Album Terbaru",
            new java.sql.Date((new Date()).getTime()),
            5,
            3,
            1,
            1,
            penerbit.getIdPenerbit(),
            pengarang.getIdPengarang(),
            kategori.getIdKategori()
        );

        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(1, 123456789012345L, "Dian", "Ilmu Komputer", "Fakultas Teknologi");

        // Membuat objek DosenStaff
        DosenStaff dosenStaff = new DosenStaff(1234567890L, "Budi", "Ilmu Komputer", "Fakultas Teknologi");

        // Membuat objek transaksi
        Transaksi transaksi = new Transaksi(
            1,
            bukuMajalah.getIdBuku(),
            cd.getIdCD(),
            mahasiswa.getIdMahasiswa(),
            bukuMajalah.getISBN(),
            "Pinjam untuk 1 minggu",
            "Kembali sebelum tanggal 25 April 2024",
            "BAIK",
            50000,
            100000,
            1,
            20000
        );

        // Membuat objek pustakawan
        Pustakawan pustakawan = new Pustakawan(
            1,
            bukuMajalah.getIdBuku(),
            cd.getIdCD(),
            transaksi.getIdTransaksi(),
            "Susi",
            "susi",
            "susi@example.com",
            "password123",
            "Perempuan",
            "Staff"
        );

        // Simulasi meminjam buku
        System.out.println("Pustakawan " + pustakawan.getNama() + " membantu meminjam buku dengan detail:");
        System.out.println("Buku: " + bukuMajalah.getJudul());
        System.out.println("Peminjam: " + mahasiswa.getNama());
        System.out.println("Detail Pinjaman: " + transaksi.getPinjamDetail());

        // Simulasi meminjam CD
        System.out.println("\nPustakawan " + pustakawan.getNama() + " membantu meminjam CD dengan detail:");
        System.out.println("CD: " + cd.getJudul());
        System.out.println("Peminjam: " + mahasiswa.getNama());
        System.out.println("Detail Pinjaman: " + transaksi.getPinjamDetail());
    }
}
