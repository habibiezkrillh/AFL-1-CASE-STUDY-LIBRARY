public class DosenStaff {
    private long NIK;
    private String nama;
    private String prodi;
    private String department;

    public DosenStaff(long NIK, String nama, String prodi, String department) {
        this.NIK = NIK;
        this.nama = nama;
        this.prodi = prodi;
        this.department = department;
    }

    public long getNIK() {
        return NIK;
    }

    public void setNIK(long NIK) {
        this.NIK = NIK;
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
        return "DosenStaff{" +
                "NIK=" + NIK +
                ", nama='" + nama + '\'' +
                ", prodi='" + prodi + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

