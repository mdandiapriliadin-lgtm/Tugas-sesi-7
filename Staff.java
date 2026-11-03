public class Staff extends Pegawai {
    private double gajiPerJam;
    private int jamKerja;

    public Staff(String id, String nama, double gajiPerJam, int jamKerja) {
        super(id, nama);
        this.gajiPerJam = gajiPerJam;
        this.jamKerja = jamKerja;
    }

    // Implementasi hitungGaji() versi Staff
    @Override
    public double hitungGaji() {
        return gajiPerJam * jamKerja;
    }
}