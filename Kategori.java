public class Kategori {
    private int idKategori;
    private String nama;
    private String deskripsi;

    public Kategori(int idKategori, String nama, String deskripsi) {
        this.idKategori = idKategori;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return "Kategori{" +
                "idKategori=" + idKategori +
                ", nama='" + nama + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                '}';
    }
}
