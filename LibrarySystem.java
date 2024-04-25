import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Pengarang> pengarangList = new ArrayList<>();
    private List<Penerbit> penerbitList = new ArrayList<>();
    private List<Kategori> kategoriList = new ArrayList<>();
    private List<BukuMajalah> bukuMajalahList = new ArrayList<>();
    private List<CD> cdList = new ArrayList<>();
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private List<DosenStaff> dosenStaffList = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();
    private List<Transaksi> transaksiList = new ArrayList<>();
    private List<Pustakawan> pustakawanList = new ArrayList<>();

    public void addPengarang(Pengarang pengarang) {
        pengarangList.add(pengarang);
    }

    public void addPenerbit(Penerbit penerbit) {
        penerbitList.add(penerbit);
    }

    public void addKategori(Kategori kategori) {
        kategoriList.add(kategori);
    }

    public void addBukuMajalah(BukuMajalah bukuMajalah) {
        bukuMajalahList.add(bukuMajalah);
    }

    public void addCD(CD cd) {
        cdList.add(cd);
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    public void addDosenStaff(DosenStaff dosenStaff) {
        dosenStaffList.add(dosenStaff);
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void addTransaksi(Transaksi transaksi) {
        transaksiList.add(transaksi);
    }

    public void addPustakawan(Pustakawan pustakawan) {
        pustakawanList.add(pustakawan);
    }

    public void printAllEntities() {
        System.out.println("Pengarang:");
        pengarangList.forEach(System.out::println);
        System.out.println("Penerbit:");
        penerbitList.forEach(System.out::println);
        System.out.println("Kategori:");
        kategoriList.forEach(System.out::println);
        System.out.println("Buku Majalah:");
        bukuMajalahList.forEach(System.out::println);
        System.out.println("CD:");
        cdList.forEach(System.out::println);
        System.out.println("Mahasiswa:");
        mahasiswaList.forEach(System.out::println);
        System.out.println("Dosen/Staff:");
        dosenStaffList.forEach(System.out::println);
        System.out.println("Client:");
        clientList.forEach(System.out::println);
        System.out.println("Transaksi:");
        transaksiList.forEach(System.out::println);
        System.out.println("Pustakawan:");
        pustakawanList.forEach(System.out::println);
    }
}
