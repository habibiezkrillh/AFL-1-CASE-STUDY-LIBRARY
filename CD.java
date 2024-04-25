import java.sql.Date;

public class CD {
    private int idCD;
    private String judul;
    private Date tahunTerbit;
    private int jumlahTotal;
    private int jumlahTersedia;
    private int jumlahPinjam;
    private int jumlahRusak;
    private int idPenerbit;
    private int idPengarang;
    private int idKategori;

    public CD(int idCD, String judul, Date tahunTerbit, int jumlahTotal, int jumlahTersedia, int jumlahPinjam, int jumlahRusak, int idPenerbit, int idPengarang, int idKategori) {
        this.idCD = idCD;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.jumlahTotal = jumlahTotal;
        this.jumlahTersedia = jumlahTersedia;
        this.jumlahPinjam = jumlahPinjam;
        this.jumlahRusak = jumlahRusak;
        this.idPenerbit = idPenerbit;
        this.idPengarang = idPengarang;
        this.idKategori = idKategori;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Date getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Date tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getJumlahTotal() {
        return jumlahTotal;
    }

    public void setJumlahTotal(int jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }

    public int getJumlahTersedia() {
        return jumlahTersedia;
    }

    public void setJumlahTersedia(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public int getJumlahRusak() {
        return jumlahRusak;
    }

    public void setJumlahRusak(int jumlahRusak) {
        this.jumlahRusak = jumlahRusak;
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

    @Override
    public String toString() {
        return "CD{" +
                "idCD=" + idCD +
                ", judul='" + judul + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                ", jumlahTotal=" + jumlahTotal +
                ", jumlahTersedia=" + jumlahTersedia +
                ", jumlahPinjam=" + jumlahPinjam +
                ", jumlahRusak=" + jumlahRusak +
                ", idPenerbit=" + idPenerbit +
                ", idPengarang=" + idPengarang +
                ", idKategori=" + idKategori +
                '}';
    }
}
