public class BukuMajalah {
    private int idBuku;
    private int idPenerbit;
    private int idPengarang;
    private int idKategori;
    private String jenisSampul;
    private String edisi;
    private String judul;
    private String bukuMajalahCol;
    private int tahunTerbit;
    private int jumlahRusak;
    private int jumlahPinjam;
    private int jumlahTersedia;
    private int jumlahTotal;
    private long ISBN;

    public BukuMajalah(int idBuku, int idPenerbit, int idPengarang, int idKategori, String jenisSampul, String edisi,
                       String judul, String bukuMajalahCol, int tahunTerbit, int jumlahRusak, int jumlahPinjam, int jumlahTersedia, int jumlahTotal, long ISBN) {
        this.idBuku = idBuku;
        this.idPenerbit = idPenerbit;
        this.idPengarang = idPengarang;
        this.idKategori = idKategori;
        this.jenisSampul = jenisSampul;
        this.edisi = edisi;
        this.judul = judul;
        this.bukuMajalahCol = bukuMajalahCol;
        this.tahunTerbit = tahunTerbit;
        this.jumlahRusak = jumlahRusak;
        this.jumlahPinjam = jumlahPinjam;
        this.jumlahTersedia = jumlahTersedia;
        this.jumlahTotal = jumlahTotal;
        this.ISBN = ISBN;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(int idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public int getIdPengarang() {
        return idPengarang;
    }

    public void setIdPengarang(int idPengarang) {
        this.idPengarang = idPengarang;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getJenisSampul() {
        return jenisSampul;
    }

    public void setJenisSampul(String jenisSampul) {
        this.jenisSampul = jenisSampul;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getBukuMajalahCol() {
        return bukuMajalahCol;
    }

    public void setBukuMajalahCol(String bukuMajalahCol) {
        this.bukuMajalahCol = bukuMajalahCol;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getJumlahRusak() {
        return jumlahRusak;
    }

    public void setJumlahRusak(int jumlahRusak) {
        this.jumlahRusak = jumlahRusak;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public int getJumlahTersedia() {
        return jumlahTersedia;
    }

    public void setJumlahTersedia(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    }

    public int getJumlahTotal() {
        return jumlahTotal;
    }

    public void setJumlahTotal(int jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "BukuMajalah{" +
                "idBuku=" + idBuku +
                ", idPenerbit=" + idPenerbit +
                ", idPengarang=" + idPengarang +
                ", idKategori=" + idKategori +
                ", jenisSampul='" + jenisSampul + '\'' +
                ", edisi='" + edisi + '\'' +
                ", judul='" + judul + '\'' +
                ", bukuMajalahCol='" + bukuMajalahCol + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                ", jumlahRusak=" + jumlahRusak +
                ", jumlahPinjam=" + jumlahPinjam +
                ", jumlahTersedia=" + jumlahTersedia +
                ", jumlahTotal=" + jumlahTotal +
                ", ISBN=" + ISBN +
                '}';
    }
}
