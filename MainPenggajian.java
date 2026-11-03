import java.util.ArrayList;

public class MainPenggajian {
    public static void main(String[] args) {
        Manajer m1 = new Manajer("M001", "Budi Santoso", 15000000, 5000000);
        Staff s1 = new Staff("S001", "Siti Aminah", 50000, 160);
        Staff s2 = new Staff("S002", "Andi Wijaya", 50000, 172);

        // Simpan semua objek ke dalam ArrayList bertipe Pegawai
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(m1);
        daftarPegawai.add(s1);
        daftarPegawai.add(s2);

        System.out.println("===== SLIP GAJI BULAN INI =====");
        for (Pegawai p : daftarPegawai) {
            System.out.println("Tipe Objek : " + p.getTipePegawai());
            p.cetakSlipGaji();
        }

        System.out.println("\n===== CEK TIPE OBJEK =====");
        for (Pegawai p : daftarPegawai) {
            if (p instanceof Manajer) {
                System.out.println(p.nama + " adalah MANAJER (dapat tunjangan)");
            } else if (p instanceof Staff) {
                System.out.println(p.nama + " adalah STAFF (gaji per jam)");
            }
        }

        double totalPengeluaran = 0;
        for (Pegawai p : daftarPegawai) {
            totalPengeluaran += p.hitungGaji();
        }
        System.out.println("\nTotal Pengeluaran Perusahaan: Rp " + totalPengeluaran);
    }
}