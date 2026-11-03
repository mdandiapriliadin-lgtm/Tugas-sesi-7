public class CustomerService extends PegawaiBank {
    private int ratingKepuasan; // Nilai 1 - 5

    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {
        super(id, nama, gajiPokok);
        this.ratingKepuasan = ratingKepuasan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (ratingKepuasan * 500000);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rating CS  : " + ratingKepuasan + " / 5");
        System.out.println("Gaji Total : Rp " + hitungGaji());
    }
}