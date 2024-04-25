public class Pustakawan {
    private int idPustakawan;
    private int idBuku;
    private int idCD;
    private int idTransaksi;
    private String nama;
    private String username;
    private String email;
    private String password;
    private String jenisKelamin;
    private String level;

    public Pustakawan(int idPustakawan, int idBuku, int idCD, int idTransaksi, String nama, String username, String email, String password,
                      String jenisKelamin, String level) {
        this.idPustakawan = idPustakawan;
        this.idBuku = idBuku;
        this.idCD = idCD;
        this.idTransaksi = idTransaksi;
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
        this.level = level;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }

    public void setIdPustakawan(int idPustakawan) {
        this.idPustakawan = idPustakawan;
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

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pustakawan{" +
                "idPustakawan=" + idPustakawan +
                ", idBuku=" + idBuku +
                ", idCD=" + idCD +
                ", idTransaksi=" + idTransaksi +
                ", nama='" + nama + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}