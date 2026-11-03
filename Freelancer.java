public class Freelancer extends Pegawai {
    private int jumlahProyek;
    private double tarifPerProyek;

    public Freelancer(String id, String nama, int jumlahProyek, double tarifPerProyek) {
        super(id, nama);
        this.jumlahProyek = jumlahProyek;
        this.tarifPerProyek = tarifPerProyek;
    }

    // Override method hitungGaji() khusus Freelancer
    @Override
    public double hitungGaji() {
        return jumlahProyek * tarifPerProyek;
    }
}