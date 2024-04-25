public class Client {
    private int idClient;
    private int idMahasiswa;
    private long NIK;

    public Client(int idClient, int idMahasiswa, long NIK) {
        this.idClient = idClient;
        this.idMahasiswa = idMahasiswa;
        this.NIK = NIK;
    }

    // Getters dan Setters
    public int getIdClient() {
        return idClient;
    }

    public int getIdMahasiswa() {
        return idMahasiswa;
    }

    public long getNIK() {
        return NIK;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", idMahasiswa=" + idMahasiswa +
                ", NIK=" + NIK +
                '}';
    }
}
