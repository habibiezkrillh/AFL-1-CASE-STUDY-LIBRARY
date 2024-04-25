public class Penerbit {
    private int idPenerbit;
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;

    public Penerbit(int idPenerbit, String nama, String alamat, String noTelp, String email) {
        this.idPenerbit = idPenerbit;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    public int getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(int idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Penerbit{" +
                "idPenerbit=" + idPenerbit +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", noTelp='" + noTelp + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
