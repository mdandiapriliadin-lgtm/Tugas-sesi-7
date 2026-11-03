public class Manajer extends Pegawai {
    private double gajiPokok;
    private double tunjanganJabatan;

    public Manajer(String id, String nama, double gajiPokok, double tunjanganJabatan) {
        super(id, nama);
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // Implementasi hitungGaji() versi Manajer
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
}