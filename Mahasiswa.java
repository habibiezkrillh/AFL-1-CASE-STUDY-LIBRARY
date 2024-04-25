public class Mahasiswa {
    private int idMahasiswa;
    private long NIM;
    private String nama;
    private String prodi;
    private String department;

    public Mahasiswa(int idMahasiswa, long NIM, String nama, String prodi, String department) {
        this.idMahasiswa = idMahasiswa;
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.department = department;
    }

    public int getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(int idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public long getNIM() {
        return NIM;
    }

    public void setNIM(long NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "idMahasiswa=" + idMahasiswa +
                ", NIM=" + NIM +
                ", nama='" + nama + '\'' +
                ", prodi='" + prodi + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
