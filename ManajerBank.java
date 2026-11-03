public class ManajerBank extends PegawaiBank {
    private boolean targetTercapai;

    public ManajerBank(String id, String nama, double gajiPokok, boolean targetTercapai) {
        super(id, nama, gajiPokok);
        this.targetTercapai = targetTercapai;
    }

    @Override
    public double hitungGaji() {
        if (targetTercapai) {
            return gajiPokok + (gajiPokok * 0.20); // Bonus tunjangan 20%
        }
        return gajiPokok;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Target     : " + (targetTercapai ? "Tercapai (+20%)" : "Tidak Tercapai"));
        System.out.println("Gaji Total : Rp " + hitungGaji());
    }
}