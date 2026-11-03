public class Pegawai {
    protected String id;
    protected String nama;

    public Pegawai(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public double hitungGaji() {
        return 0;
    }

    public void cetakSlipGaji() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : Rp " + hitungGaji());
        System.out.println("-----------------------------------------");
    }

    public String getTipePegawai() {
        return this.getClass().getSimpleName();
    }
}