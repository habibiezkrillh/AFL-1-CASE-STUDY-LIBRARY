public class Transaksi {
    private int idTransaksi;
    private int idBuku;
    private int idCD;
    private int idClient;
    private long ISBN;
    private String pinjamDetail;
    private String kembaliDetail;
    private String statusRusak;
    private int totalHargaRusak;
    private int jumlahBayar;
    private int totalRusak;
    private int hargaTelat;

    public Transaksi(int idTransaksi, int idBuku, int idCD, int idClient, long ISBN, String pinjamDetail, String kembaliDetail, String statusRusak,
                     int totalHargaRusak, int jumlahBayar, int totalRusak, int hargaTelat) {
        this.idTransaksi = idTransaksi;
        this.idBuku = idBuku;
        this.idCD = idCD;
        this.idClient = idClient;
        this.ISBN = ISBN;
        this.pinjamDetail = pinjamDetail;
        this.kembaliDetail = kembaliDetail;
        this.statusRusak = statusRusak;
        this.totalHargaRusak = totalHargaRusak;
        this.jumlahBayar = jumlahBayar;
        this.totalRusak = totalRusak;
        this.hargaTelat = hargaTelat;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getPinjamDetail() {
        return pinjamDetail;
    }

    public void setPinjamDetail(String pinjamDetail) {
        this.pinjamDetail = pinjamDetail;
    }

    public String getKembaliDetail() {
        return kembaliDetail;
    }

    public void setKembaliDetail(String kembaliDetail) {
        this.kembaliDetail = kembaliDetail;
    }

    public String getStatusRusak() {
        return statusRusak;
    }

    public void setStatusRusak(String statusRusak) {
        this.statusRusak = statusRusak;
    }

    public int getTotalHargaRusak() {
        return totalHargaRusak;
    }

    public void setTotalHargaRusak(int totalHargaRusak) {
        this.totalHargaRusak = totalHargaRusak;
    }

    public int getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(int jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public int getTotalRusak() {
        return totalRusak;
    }

    public void setTotalRusak(int totalRusak) {
        this.totalRusak = totalRusak;
    }

    public int getHargaTelat() {
        return hargaTelat;
    }

    public void setHargaTelat(int hargaTelat) {
        this.hargaTelat = hargaTelat;
    }

    @Override
    public String toString() {
        return "Transaksi{" +
                "idTransaksi=" + idTransaksi +
                ", idBuku=" + idBuku +
                ", idCD=" + idCD +
                ", idClient=" + idClient +
                ", ISBN=" + ISBN +
                ", pinjamDetail='" + pinjamDetail + '\'' +
                ", kembaliDetail='" + kembaliDetail + '\'' +
                ", statusRusak='" + statusRusak + '\'' +
                ", totalHargaRusak=" + totalHargaRusak +
                ", jumlahBayar=" + jumlahBayar +
                ", totalRusak=" + totalRusak +
                ", hargaTelat=" + hargaTelat +
                '}';
    }
}